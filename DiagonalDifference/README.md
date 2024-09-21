# 📐 Diagonal Difference 📐

## 📖 Problem Statement

You are given a square matrix (2D array) of integers. The task is to calculate the absolute difference between the sums of its diagonals.

**Example:**

- Input:

```
3
11 2 4
4 5 6
10 8 -12

- Output: `15`
```

## 🛠️ Function Description

### `diagonalDifference(List<List<Integer>> arr)`

- **Parameters:**

  - `List<List<Integer>> arr`: A 2D array representing the square matrix.

- **Returns:**
  - `int`: The absolute difference between the sums of the diagonals.

## 📥 Input Format

- The first line contains a single integer, `n`, the size of the square matrix (both the number of rows and columns).
- Each of the next `n` lines contains `n` space-separated integers representing the elements of the matrix.

## 📤 Output Format

- Return the absolute difference of the sums of the two diagonals.

## 📊 Example

### Input

```
3
11 2 4
4 5 6
10 8 -12

```

**Output:**

```java
15
```

### Explanation

The primary diagonal sum is \(11 + 5 - 12 = 4\) and the secondary diagonal sum is \(4 + 5 + 10 = 19\). The absolute difference is \(|4 - 19| = 15\).

## 🧠 Approach

The solution involves the following steps:

1. Initialize two variables to hold the sums of the primary and secondary diagonals.
2. Iterate through the indices of the matrix, adding the appropriate elements to the respective diagonal sums.
3. Return the absolute difference between the two sums.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
