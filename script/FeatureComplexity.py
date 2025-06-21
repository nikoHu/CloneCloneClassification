# 统计特征复杂度分布

import math
from sklearn.cluster import MeanShift, estimate_bandwidth
import numpy as np
import os


def getProjDomain(path):
    '''
        获取项目所属领域，目前有三个领域android，network，database
    '''
    projDomainMap = dict()
    with open(path, "r", encoding = "utf-8") as f:
        for line in f:
            if("repos_name" in line):
                continue
            lineArr = line.strip().split(",")
            projName = lineArr[0] + "-#-" + lineArr[2]
            domain = lineArr[-1]

            projDomainMap[projName] = domain

    return projDomainMap

def getCloneComplexity(path):
    '''
        读取克隆组复杂度特征向量，变体复杂度，分布复杂度，上下文复杂度，语法单元复杂度，归一化行数
    '''
    groupComplexityMap = dict()
    groupProjectMap = dict()
    with open(path, "r", encoding = "utf-8") as f:
        for line in f:
            if("projectName" in line):
                continue
            lineArr = line.strip().split(",")
            projectName = lineArr[0]
            groupId = lineArr[1]
            complexity = lineArr[2:]

            groupComplexityMap[groupId] = complexity
            groupProjectMap[groupId] = projectName

    return groupComplexityMap, groupProjectMap

def analysisComplexityDistribution(groupComplexityMap, groupProjectMap):
    '''
        统计融合的特征复杂度分布
        1，计算融合特征复杂度
        2，获取不同领域融合特征复杂度列表
        3，计算特征复杂度累积分布
    '''
    fusedComplexityMap = dict()
    featureListByDomain = dict()
    for groupId in groupComplexityMap:
        complexity = groupComplexityMap[groupId]
        fusedComplexity = 0
        instanceNumber = complexity[5]
        instanceRatio = float(instanceNumber) / 7
        if(instanceRatio >= 1.0):
            instanceRatio = 1.0
        for index in range(len(complexity)):
            if(index == 0 or index == 5):
                continue
            if(index >= 1 and index <= 3):
                # complexity[index] *= float(instanceRatio)
                fusedComplexity += 0.25 * float(complexity[index]) * float(instanceRatio)
        # print(complexity)
        # for value in complexity[1:-1]:
        #     fusedComplexity += 0.25 * float(value)
        # if(fusedComplexity == 0.0):
        #     print(groupId)
        fusedComplexityMap[groupId] = fusedComplexity

    complexityListByDomain = dict()
    vComplexityListByDomain = dict()
    dComplexityListByDomain = dict()
    crComplexityListByDomain = dict()
    sComplexityListByDomain = dict()
    for groupId in fusedComplexityMap:
        projName = groupProjectMap[groupId]
        domain = ""
        curComplexity = fusedComplexityMap[groupId]
        complexityVector = groupComplexityMap[groupId]
        instanceNumber = complexityVector[5]
        instanceRatio = float(instanceNumber) / 7
        if(instanceRatio >= 1.0):
            instanceRatio = 1.0
        # instanceNumber = complexityVector[5]
        # instanceRatio = instanceNumber / 7
        if(domain in complexityListByDomain):
            complexityListByDomain[domain].append(curComplexity)
            vComplexityListByDomain[domain].append(float(complexityVector[1]) * instanceRatio)
            dComplexityListByDomain[domain].append(float(complexityVector[2]) * instanceRatio)
            crComplexityListByDomain[domain].append(float(complexityVector[3]) * instanceRatio)
            sComplexityListByDomain[domain].append(float(complexityVector[4]))
        else:
            complexityListByDomain[domain] = list()
            complexityListByDomain[domain].append(curComplexity)
            vComplexityListByDomain[domain] = list()
            vComplexityListByDomain[domain].append(float(complexityVector[1]) * instanceRatio)
            dComplexityListByDomain[domain] = list()
            dComplexityListByDomain[domain].append(float(complexityVector[2]) * instanceRatio)
            crComplexityListByDomain[domain] = list()
            crComplexityListByDomain[domain].append(float(complexityVector[3]) * instanceRatio)
            sComplexityListByDomain[domain] = list()
            sComplexityListByDomain[domain].append(float(complexityVector[4]))

        if(domain in featureListByDomain):
            featureListByDomain[domain].append(groupComplexityMap[groupId])
        else:
            featureListByDomain[domain] = list()
            featureListByDomain[domain].append(groupComplexityMap[groupId])
    
    # print(complexityListByDomain)

    return complexityListByDomain, featureListByDomain, vComplexityListByDomain, dComplexityListByDomain, crComplexityListByDomain, sComplexityListByDomain

def getAccumulationDistribution(densityList):
    dendistyDistribution = [0 for i in range(12)]
    for density in densityList:
        index = math.ceil(density * 10)
        if(density == 1):
            index = 11
        dendistyDistribution[index] += 1

    sumOfDisti = sum(dendistyDistribution)
    dendistyDistribution = [num / sumOfDisti for num in dendistyDistribution]

    for i in range(len(dendistyDistribution)):
        if(i == 0):
            continue
        dendistyDistribution[i] += dendistyDistribution[i - 1]

    return dendistyDistribution

def trainCluster(data):
    X = np.array(data)
    bandwidth1 = estimate_bandwidth(X, quantile=0.2)
    clustering = MeanShift(bandwidth = bandwidth1).fit(X)

    print("train finish!")
    return clustering

def featureCluster(complexityList):
    print("start clustering...")
    ms = trainCluster(complexityList)

    label_ = ms.labels_
    center_ = ms.cluster_centers_
    labels_unique = np.unique(label_)
    n_clusters_ = len(labels_unique)
    print('label ', len(label_)) #4096
    # print('center ', center_.shape) #(3,32)
    print('labels_unique ', labels_unique)  #[0 1 2 ]
    print('n_clusters_ ', n_clusters_) # 3

def cluster(domain):
    featureList = featureListByDomain[domain]
    complexList = [feature[3:] for feature in featureList]
    featureCluster(complexList)

def outputToFile(outputFilePath, header, distribution, column):
    f = open(outputFilePath, 'a', encoding='utf8')
    if os.path.getsize(outputFilePath) == 0:
        f.write(header + '\n')
    f.write(str(column) + ', ')
    for i in range(len(distribution)):
        if i != len(distribution) - 1:
            f.write(str(distribution[i]) + ', ')
        else:
            f.write(str(distribution[i]) + '\n')
    f.close()

def wtiteResult(complexityListByDomain,  vComplexityListByDomain, dComplexityListByDomain, crComplexityListByDomain, sComplexityListByDomain):
    header = 'complexity(c),c=0, 0<c<=0.1, 0.1<c<=0.2, 0.2<c<=0.3, 0.3<c<=0.4, 0.4<c<=0.5, 0.5<c<=0.6, 0.6<c<=0.7, 0.7<c<=0.8, 0.8<c<=0.9, 0.9<c<1, c=1'
    complexityResult = "result/complexity.csv"
    totalComplexity = list()
    for domain in complexityListByDomain:
        complexityList = complexityListByDomain[domain]
        totalComplexity += complexityList
        outputToFile(complexityResult, header, getAccumulationDistribution(complexityList), domain)
    # 所有的domainList加到一起再写入文件，得到总的累积分布
    outputToFile(complexityResult, header, getAccumulationDistribution(totalComplexity), "total")


    complexityResult = "result/vcomplexity.csv"
    totalvComplexity = list()
    for domain in vComplexityListByDomain:
        complexityList = vComplexityListByDomain[domain]
        totalvComplexity += complexityList
        outputToFile(complexityResult, header, getAccumulationDistribution(complexityList), domain)
    outputToFile(complexityResult, header, getAccumulationDistribution(totalvComplexity), "total")

    complexityResult = "result/dcomplexity.csv"
    totaldComplexity = list()
    for domain in dComplexityListByDomain:
        complexityList = dComplexityListByDomain[domain]
        totaldComplexity += complexityList
        outputToFile(complexityResult, header, getAccumulationDistribution(complexityList), domain)
    outputToFile(complexityResult, header, getAccumulationDistribution(totaldComplexity), "total")

    complexityResult = "result/crcomplexity.csv"
    totalcrComplexity = list()
    for domain in crComplexityListByDomain:
        complexityList = crComplexityListByDomain[domain]
        totalcrComplexity += complexityList
        outputToFile(complexityResult, header, getAccumulationDistribution(complexityList), domain)
    outputToFile(complexityResult, header, getAccumulationDistribution(totalcrComplexity), "total")

    complexityResult = "result/scomplexity.csv"
    totalsComplexity = list()
    for domain in sComplexityListByDomain:
        complexityList = sComplexityListByDomain[domain]
        totalsComplexity += complexityList
        outputToFile(complexityResult, header, getAccumulationDistribution(complexityList), domain)
    outputToFile(complexityResult, header, getAccumulationDistribution(totalsComplexity), "total")

def judgeCloneClass(groupComplexityMap,  groupProjectMap):
    f = open("result/cloneClass.csv", "w")
    f.write("projName,groupId,vComplexity,dComplexity,crComplexity,sComplexity,insNumber,domain,cloneClass\n")
    for groupId in groupComplexityMap:
        feature = groupComplexityMap[groupId]
        proj = groupProjectMap[groupId]
        domain = ""
        instanceNumber = feature[5]
        instanceRatio = float(instanceNumber) / 7
        if(instanceRatio >= 1.0):
            instanceRatio = 1.0
        vComplexity = float(feature[1]) * instanceRatio
        dComplexity = float(feature[2]) * instanceRatio
        crComplexity = float(feature[3]) * instanceRatio
        sComplexity = float(feature[4])
        # print(vComplexity, dComplexity, crComplexity, sComplexity)
        threshold_h_v = 0.3
        threshold_h_d = 0.3
        threshold_h_cr = 0.3
        threshold_h_s = 0.6

        threshold_l_v = 0
        threshold_l_d = 0
        threshold_l_cr = 0
        threshold_l_s = 0.3
        cloneClass = 0
        if(vComplexity <= threshold_l_v and dComplexity <= threshold_l_d and crComplexity <= threshold_l_cr and sComplexity <= threshold_l_s):
            cloneClass = 1  # 全是1类就是1类
        elif((vComplexity > threshold_l_v or dComplexity > threshold_l_d or crComplexity > threshold_l_cr or sComplexity > threshold_l_s) and vComplexity <= threshold_h_v and dComplexity <= threshold_h_d and crComplexity <= threshold_h_cr and sComplexity <= threshold_h_s):
            cloneClass = 2  # 没有三类 有二类 就是 二类
        else:
            cloneClass = 3 # 其余 三类
        # cloneClass = 0
        # if(vComplexity <= 0.3 and dComplexity <= 0.3 and crComplexity <= 0.2 and sComplexity <= 0.3):
        #     cloneClass = 1
        # elif((vComplexity > 0.3 or dComplexity > 0.3 or crComplexity > 0.2 or sComplexity > 0.3) and vComplexity <= 0.5 and dComplexity <= 0.5 and crComplexity <= 0.5 and sComplexity <= 0.5):
        #     cloneClass = 2
        # else:
        #     cloneClass = 3

        f.write(proj + "," + groupId + "," + ",".join(feature[1:]) + "," + domain + "," + str(cloneClass)  + "\n")
    f.close()
 

if __name__ == "__main__":
    # projDomainMap = getProjDomain("D:\\Clone_Management_Research_Proj\\CloneClassification\\result\\dataset100star\\manualResult100.csv")
    groupComplexityMap, groupProjectMap = getCloneComplexity("result/cloneComplexFeature.csv")

    complexityListByDomain, featureListByDomain,  vComplexityListByDomain, dComplexityListByDomain, crComplexityListByDomain, sComplexityListByDomain = analysisComplexityDistribution(groupComplexityMap, groupProjectMap)

    judgeCloneClass(groupComplexityMap, groupProjectMap)


    wtiteResult(complexityListByDomain,  vComplexityListByDomain, dComplexityListByDomain, crComplexityListByDomain, sComplexityListByDomain)

# /home/hduse/zlz/javaPro/CloneClassification_FythM/CloneClassification/lab3dastset/kafka-trunk/share-coordinator/src/test/java/org/apache/kafka/coordinator/share/metrics/ShareCoordinatorMetricsTest.java