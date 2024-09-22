# 🦘 Kangaroo Jump 🦘

## 📖 Problem Statement

There are two kangaroos on a number line ready to jump in the positive direction (toward greater values). The first kangaroo is at position `x1` with a jump distance of `v1`, and the second kangaroo is at position `x2` with a jump distance of `v2`.

You need to determine if they will land on the same position after making the same number of jumps. If they land on the same position, print `YES`, otherwise print `NO`.

## 📥 Input Format

Four integers:

- `x1`: Starting position of kangaroo 1.
- `v1`: Jump distance of kangaroo 1.
- `x2`: Starting position of kangaroo 2.
- `v2`: Jump distance of kangaroo 2.

## 📤 Output Format

Print `YES` if the kangaroos will land at the same spot at the same time.
Print `NO` if they will never land at the same spot at the same time.

## 📊 Examples

### Example 1

#### Input

```
0 3 4 2

```

**Output:**

```java
YES
```

### Explanation

![Example](https://s3.amazonaws.com/hr-assets/0/1516005283-e74e76ff0c-kangaroo.png)

- Kangaroo 1 starts at position 0 and jumps 3 units every time.
- Kangaroo 2 starts at position 4 and jumps 2 units every time.
- After 4 jumps, both kangaroos land at position 12:
  - Kangaroo 1: `0, 3, 6, 9, 12`
  - Kangaroo 2: `4, 6, 8, 10, 12`
- Hence, the output is `YES`.

### Example 2

#### Input

```
0 2 5 3

```

**Output:**

```java
NO
```

### Explanation

- Kangaroo 1 starts at position 0 and jumps 2 units.
- Kangaroo 2 starts at position 5 and jumps 3 units.
- Kangaroo 1 can never catch up to kangaroo 2 because kangaroo 2 jumps farther each time.

## 🧠 Approach

1. **Analyze the situation**:

   - If kangaroo 1 is ahead of kangaroo 2 (`x1 > x2`) but jumps less or equal distance (`v1 ≤ v2`), kangaroo 1 will never be able to catch up. Thus, the result is `NO`.
   - Similarly, if kangaroo 2 is ahead (`x2 > x1`) but jumps less or equal distance, it can't catch up.

2. **Check conditions for meeting**:
   - Kangaroo 1 and kangaroo 2 will only meet if:
     - The kangaroo behind has a higher velocity (`v1 > v2` or `v2 > v1`).
     - The difference between their starting positions is divisible by the difference in their velocities, i.e.,
       \[
       (x2 - x1) \% (v1 - v2) == 0
       \]

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
