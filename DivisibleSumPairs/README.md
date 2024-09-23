# 🎉 Divisible Sum Pairs 🎉

## 📖 Problem Statement

You are given an array of integers and a positive integer k. Your task is to find and return the number of pairs (i, j) in the array such that:

- i < j (index i is less than index j)
- (arr[i] + arr[j]) is divisible by k

The challenge is to count how many such pairs exist in the array.

### **Input Format**

- The first line contains two space-separated integers, `n` (the number of integers) and `k` (the divisor).
- The second line contains `n` space-separated integers representing the elements of the array.

### **Output Format**

Print the number of pairs `(i, j)` that meet the criteria.

## 📊 Examples

### Example 1

#### Input:

```
6 3
1 3 2 6 1 2

```

**Output:**

```java
5
```

### Explanation:

The pairs that meet the criteria are:

- (0, 2) -> (1 + 3) % 3 == 0
- (0, 5) -> (1 + 6) % 3 == 0
- (1, 4) -> (2 + 5) % 3 == 0
- (2, 3) -> (3 + 4) % 3 == 0
- (3, 5) -> (4 + 6) % 3 == 0

### Example 2

#### Input

```
4 2
1 3 2 6
```

**Output:**

```java
5
```

#### Explanation:

The pairs that meet the criteria are:

- (0, 1) -> (1 + 3) % 2 == 0
- (0, 2) -> (1 + 2) % 2 == 0
- (0, 3) -> (1 + 6) % 2 == 0
- (1, 3) -> (3 + 6) % 2 == 0
- (2, 3) -> (2 + 6) % 2 == 0

## 🧠 Approach and Solution

To solve this problem, we need to iterate over every possible pair of elements in the array and check two conditions:

- The index `i` is less than `j (i < j)`.
- The sum of the elements at indices `i` and `j` is divisible by `k`. This means we check if `(ar[i] + ar[j]) % k == 0`.

Steps:

- Initialization:

  - Parse the input to get the array size `n`, divisor `k`, and the array `ar`.

- Nested Loop for Pair Checking:

  - We use two loops. The first loop goes from `i = 0` to `n-1`, and the second loop goes from `j = i+1` to `n-1`. This ensures we only check pairs where `i < j`.
  - For each pair (i, j), we check if `(ar[i] + ar[j]) % k == 0.` If the sum is divisible by `k`, increment the counter.

- Return the Result:
  - After processing all pairs, return the count of valid pairs.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
