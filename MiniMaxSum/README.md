# 📊 Mini Max Sum 📊

## 📖 Problem Statement

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Print the respective minimum and maximum values as a single line of two space-separated long integers.

**Example:**

- Input: `arr = [1, 3, 5, 7, 9]`
- Output: `16 24`

## 🛠️ Function Description

### `miniMaxSum(List<Integer> arr)`

- **Parameters:**

  - `List<Integer> arr`: An array of integers.

- **Prints:**
  - Two space-separated integers representing the minimum and maximum sums.

## 📥 Input Format

- A single line of five space-separated integers.

## 📤 Output Format

- Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers.

## 📊 Example

### Input

```
1 2 3 4 5

```

**Output:**

```java
10 14
```

### Explanation

The numbers are 1, 2, 3, 4, and 5. Calculate the sums using four of the five integers:

1. Sum everything except 1: \(2 + 3 + 4 + 5 = 14\).
2. Sum everything except 2: \(1 + 3 + 4 + 5 = 13\).
3. Sum everything except 3: \(1 + 2 + 4 + 5 = 12\).
4. Sum everything except 4: \(1 + 2 + 3 + 5 = 11\).
5. Sum everything except 5: \(1 + 2 + 3 + 4 = 10\).

The minimum sum is 10 and the maximum sum is 14.

## 🧠 Approach

The solution involves the following steps:

1. Initialize variables to track the minimum and maximum values found in the array, as well as a cumulative sum of all elements.
2. Iterate through the list, updating the minimum and maximum values as well as calculating the total sum.
3. Compute the minimum sum by subtracting the maximum value from the total sum, and compute the maximum sum by subtracting the minimum value from the total sum.
4. Print the results.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
