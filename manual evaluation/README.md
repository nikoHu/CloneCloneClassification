The content of this repository consists of manual experimental records and related code for the paper titled "Code Clone Classification based on Multi-Dimension Feature Entropy." Below is a detailed introduction to each section.

# 3.2.4 clone syntax entorpy
This directory contains the manual experiments mentioned in Section 3.2.4 of the paper. We randomly selected 10 clone groups composed of a single syntactic category and 10 clone groups composed of multiple syntactic categories from the code clone detection results. These clone groups were presented to six students for evaluation, who were asked to rate the readability with a score: 1 indicated simple syntax that was easy to understand and refactor; 3 indicated the syntax of the code is too complex to understand, thus difficult to refactor; and 2 represented moderate readability.

# 4.4 distribution of different class of clone groups
This directory contains the manual experiments mentioned in Section 4.4 of the paper.Three experienced developers independently annotated each clone group using a predefined taxonomy of syntactic features: general boilerplate, general business logic, and specific business logic. Since human developers usually focus on specific business domains, we also included an LLM-based annotator. We assigned a score of 1 to general boilerplate, 2 to general business logic, and 3 to specific business logic.

# 4.5 effectiveness of clone classification
This directory contains the manual experiments mentioned in Section 4.5 of the paper.the label S1#1/S2#1 indicates that S1#1 is the first-ranked clone group in Strategy 1, while S2#1 is the first-ranked clone group in Strategy 2. If the first clone group in a pair was considered easier to refactor, a score of 1 was assigned. If the two clone groups had similar refactoring difficulty, a score of 0 was assigned. If the left clone group was considered harder to refactor, a score of -1 was assigned.
