# 🎉 The Birthday Bar 🎉

## 📖 Problem Statement

Two children, Lily and Ron, want to share a chocolate bar. Each square of the chocolate bar has an integer on it. Lily decides to share a contiguous segment of the bar selected such that:

- The length of the segment matches Ron's birth month.
- The sum of the integers on the squares is equal to his birth day.

Your task is to determine how many ways Lily can divide the chocolate bar according to these rules.

### **Input Format**

- The first line contains two space-separated integers, `n` (the number of squares in the chocolate bar) and `d` (the desired sum, which is Ron's birth day).
- The second line contains `n` space-separated integers representing the numbers on the chocolate bar.
- The third line contains a single integer, `m`, which represents the length of the segment (Ron’s birth month).

### **Output Format**

Return a single integer: the number of ways to divide the chocolate bar such that the sum of the integers in each piece is equal to `d`.

## 📊 Examples

### Example 1

#### Input:

```
5
1 2 1 3 2
3 2

```

**Output:**

```java
2
```

### Explanation:

![example1](https://s3.amazonaws.com/hr-assets/0/1489060874-a04ddb06cf-choco4.png)

The two pieces that satisfy the condition are:

- The segment `1 + 2 = 3`
- The segment `2 + 1 = 3`

### Example 2

#### Input

```
6
1 1 1 1 1 1
3 2
```

**Output:**

```java
0
```

#### Explanation:

![example2](https://s3.amazonaws.com/hr-assets/0/1489060978-e33d905668-choco5.png)

No segment of length `m` will sum to `d`.

## 🧠 Approach and Solution

1. Sliding Window Concept:

   - Traverse through the array and for each position, calculate the sum of the next m elements.
   - If the sum equals d, increment the count.
   - Move the window by one position and repeat the process.

2. Key Conditions:

   - You can only select contiguous subarrays of length m.
   - The sum of each subarray should be compared with d.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
