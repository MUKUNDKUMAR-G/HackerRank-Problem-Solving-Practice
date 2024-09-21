# 🏗️ Staircase 🏗️

## 📖 Problem Statement

Given an integer `n`, print a staircase of size `n` using `#` symbols and spaces. The staircase should be right-aligned, composed of `#` symbols, and have a height and width of `n`.

**Example:**

- Input: `n = 4`
- Output:

```
     #
    ##
   ###
  ####
```

markdown
Copy code

## 🛠️ Function Description

### `staircase(int n)`

- **Parameters:**

  - `int n`: An integer representing the size of the staircase.

- **Prints:**
  - A staircase of size `n` using `#` symbols and spaces.

## 📥 Input Format

- A single integer `n`, denoting the size of the staircase (1 ≤ n ≤ 100).

## 📤 Output Format

- Print a staircase as described, with the last line not preceded by any spaces.

## 📊 Example

### Input

```
6

```

**Output:**

```java
     #
    ##
   ###
  ####
 #####
######
```

### Explanation

The staircase is right-aligned, composed of `#` symbols and spaces, and has a height and width of `n = 6`.

## 🧠 Approach

The solution involves the following steps:

1. Loop through the numbers from 1 to `n` to represent each level of the staircase.
2. For each level, print the appropriate number of spaces followed by the `#` symbols.
3. The number of spaces decreases while the number of `#` symbols increases as you move down the staircase.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
