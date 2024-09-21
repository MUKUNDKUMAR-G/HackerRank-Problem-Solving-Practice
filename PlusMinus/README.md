# ➕➖ Plus Minus ➖➕

## 📖 Problem Statement

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with six places after the decimal.

**Example:**

```
- Input: `arr = [1, 1, 0, -1, -1]`
- Output:

0.400000
0.400000
0.200000

```

## 🛠️ Function Description

### `plusMinus(List<Integer> arr)`

- **Parameters:**

  - `List<Integer> arr`: An array of integers.

- **Prints:**
  - The ratios of positive, negative, and zero values in the array, each on a new line with six decimal places.

## 📥 Input Format

- The first line contains an integer, `n`, the size of the array.
- The second line contains `n` space-separated integers that describe the array.

## 📤 Output Format

- Print the following lines, each to six decimal places:
  - Proportion of positive values
  - Proportion of negative values
  - Proportion of zeros

## 📊 Example

### Input

```
arr = [-4, 3, -9, 0, 4, 1]

```

**Output:**

```java

Ratio of positives: 0.500000 (since
3/6 = 0.5

Ratio of negatives: 0.333333 (since
2/6 ≈ 0.333333

Ratio of zeros: 0.166667 (since
1/6 ≈ 0.166667
```

### Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array. The proportions of occurrence are:

- Positive: \( 3 / 6 = 0.500000 \)
- Negative: \( 2 / 6 = 0.333333 \)
- Zeros: \( 1 / 6 = 0.166667 \)

## 🧠 Approach

The solution involves the following steps:

1. Initialize counters for positive, negative, and zero values.
2. Iterate through the array, incrementing the respective counters based on the value.
3. Calculate the ratios by dividing the counts by the total number of elements.
4. Print the results formatted to six decimal places.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
