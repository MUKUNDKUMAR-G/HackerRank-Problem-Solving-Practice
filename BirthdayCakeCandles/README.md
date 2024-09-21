# 🎂 Birthday Cake Candles 🎂

## 📖 Problem Statement

You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

**Example:**

- **Input:** `candles = [4, 4, 1, 3]`
- **Output:** `2`

## 🛠️ Function Description

### `birthdayCakeCandles(List<Integer> candles)`

- **Parameters:**

  - `List<Integer> candles`: A list of integers representing the heights of the candles.

- **Returns:**
  - `int`: The number of candles that are tallest.

## 📥 Input Format

- The first line contains a single integer, `n`, the size of `candles[]`.
- The second line contains `n` space-separated integers, where each integer `i` describes the height of `candles[i]`.

## 📤 Output Format

- Return the integer sum of the elements in the array.

## 📊 Example

### Input

```
4
3 2 1 3

```

**Output:**

```java
2
```

### Explanation

Candle heights are `[3, 2, 1, 3]`. The tallest candles are 3 units, and there are 2 of them.

## 🧠 Approach

The solution involves the following steps:

1. Find the maximum height of the candles using `Collections.max()`.
2. Use a loop to count how many candles match that maximum height.
3. Return the count of the tallest candles.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
