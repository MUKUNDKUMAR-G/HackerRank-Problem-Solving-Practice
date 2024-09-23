# 🏅 Breaking Best and Worst Records 🏅

## 📖 Problem Statement

Maria plays college basketball and wants to go pro. Each time she competes, she records her score. She wants to be able to compare her current score against her best and worst scores to see how many times she breaks her records.

You are given an array of integers, `scores`, where each element represents Maria's score in a game. Your task is to determine how many times she breaks her best and worst records during the season.

Example:

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1

Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

### **Input Format**

- The function receives one input:
  - scores: A list of integers representing the player's scores over the season.

### **Output Format**

- The function should return a list of two integers:
  - The first integer represents the number of times the player broke their best (highest) record.
  - The second integer represents the number of times the player broke their worst (lowest) record.

## 📊 Examples

### Example 1

#### Input:

```
9
10 5 20 20 4 5 2 25 1

```

**Output:**

```java
2 4
```

### Explanation:

![example1](https://s3.amazonaws.com/hr-assets/0/1487360234-6bca5c518d-breakingbest3.png)

- Maria breaks her best score twice: when she scores 20 (the previous best was 10) and when she scores 25 (the previous best was 20).
- She breaks her worst score four times: when she scores 4 (previous worst was 10), 5 (previous worst was 4), 2 (previous worst was 4), and 1 (previous worst was 2).

### Example 2

#### Input

```
10
3 4 21 36 10 28 35 5 24 42
```

**Output:**

```java
4 0
```

#### Explanation:

![example2](https://s3.amazonaws.com/hr-assets/0/1487360375-aee4388234-breakingbest5.png)

- Maria breaks her best score four times: at scores 4, 21, 36, and 42.
- She does not break her worst score.

## 🧠 Approach and Solution

To solve this problem, we follow the below steps:

1. Initialize best and worst records:

   - Start with the first game as both the best and worst record.

2. Iterate through the scores:

   - For each score, compare it to the current best and worst scores.
   - If the score is greater than the current best score, increment the best record counter and update the best score.
   - If the score is less than the current worst score, increment the worst record counter and update the worst score.

3. Return the results:

   - At the end, return the counts of best and worst record breaks.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
