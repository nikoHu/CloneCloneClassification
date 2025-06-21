import pandas as pd

class_path  = "result/cloneClass.csv"
group_path = "result/type123_method_group_result.csv"
info_path = "result/MeasureIndex.csv"
out_path = "result/final_entorpy.csv"

def deal_test(in_path, out_path):
    result = []
    group_dic = {}  # 分组信息
    with open(group_path, 'r', encoding='utf-8') as f:
        group_id = 1
        for line in f:
            group_dic[group_id] = []
            fields = line.strip().split(',')
            ids = [int(i) for i in fields]
            group_dic[group_id] = ids
            group_id += 1
    class_df = pd.read_csv(in_path, usecols=['groupId', 'vComplexity', 'dComplexity', 'crComplexity',
       'sComplexity', 'insNumber', 'cloneClass'])
    info_df = pd.read_csv(info_path, usecols=[0, 1], header=None)
    w_v = 0.25
    w_d = 0.25
    w_cr = 0.25
    w_s = 0.25
    for index, row in class_df.iterrows():
        group_id = int(row['groupId'])
        flag = True
        for method_id in group_dic[group_id]:
            method_info = info_df[info_df[0] == method_id]
            path = str(method_info.iloc[0, 1])
            file_name = path.split("/")[-1]
            if "test" in file_name.lower():
                flag = False
                # print(file_name)
                break
        if flag:
            ratio = 1
            if row['cloneClass'] < 7:
                ratio = row['cloneClass'] / 7.0
            row['vComplexity'] = ratio * row['vComplexity']
            row['dComplexity'] = ratio * row['dComplexity']
            row['crComplexity'] = ratio * row['crComplexity']
            row['fuseE'] = row['vComplexity'] * w_v + row['dComplexity'] * w_d + row['crComplexity'] * w_cr + row['sComplexity'] * w_s
            result.append(row)
    
    # 将所有符合条件的行组成 DataFrame
    result_df = pd.DataFrame(result)

    # 写入 CSV 文件
    result_df.to_csv(out_path, index=False)

            

    


if __name__ == "__main__":
    
    deal_test(class_path, out_path)