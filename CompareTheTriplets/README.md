# 🎉 Compare The Triplets 🎉

## 📖 Overview

The **Compare The Triplets** function is designed to compare the ratings of two challenges created by Alice and Bob. Each challenge is rated on three criteria: clarity, originality, and difficulty. The function calculates the total points awarded to Alice and Bob based on their ratings.

## 🛠️ Function Description

### `compareTriplets(int[] a, int[] b)`

- **Parameters:**

  - `int[] a`: An array of three integers representing Alice's challenge ratings.
  - `int[] b`: An array of three integers representing Bob's challenge ratings.

- **Returns:**
  - `int[]`: An array containing two integers where the first element is Alice's score and the second element is Bob's score.

## 📊 Example

### Input

```
5 6 7
3 6 10

```

**Output:**

```java
1  1
```

### Explanation

- For the first comparison: Alice (5) > Bob (3) → Alice receives 1 point.
- For the second comparison: Alice (6) = Bob (6) → No points awarded.
- For the third comparison: Alice (7) < Bob (10) → Bob receives 1 point.

Thus, the result is `[1, 1]`.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
