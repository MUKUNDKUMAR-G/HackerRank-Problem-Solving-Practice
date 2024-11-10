# 📚 Drawing Book 📚

## 📖 Problem Statement

Given a book with n pages, find the minimum number of pages that must be turned to reach a target page p. Starting from either the front or the back of the book, count each page turn as one. Assume the book is opened from the left.

### **Function Description**

```
Complete the pageCount function:

Parameters:
n (integer): total pages in the book.
p (integer): the target page.

Returns:
An integer representing the minimum number of pages to turn.

```

### **Input Format**

- The first line contains an integer, n, the total pages.
- The second line contains an integer, p, the target page.

### **Output Format**

- A single integer representing the minimum number of page turns required.

## 📊 Examples

### Example 1

#### Input:

```
n = 6
p = 2
```

**Output:**

```java
1
```

### Explanation:

If the student starts turning from page 1, they only need to turn 1 page:

![Example1.1](https://s3.amazonaws.com/hr-challenge-images/22564/1467398713-1decf68d06-UntitledDiagram6.png)

If a student starts turning from page 6, they need to turn 2 pages:

![Example1.2](https://s3.amazonaws.com/hr-challenge-images/22564/1467397150-52d0a8213b-UntitledDiagram3.png)

### Example 2

#### Input:

```
n = 5
p = 4
```

**Output:**

```java
0
```

### Explanation:

If the student starts turning from page 1, they need to turn 2 pages:

![Example2.1](https://s3.amazonaws.com/hr-challenge-images/22564/1467398281-32b69f6fa9-UntitledDiagram4.png)

If they start turning from page 5, they do not need to turn any pages:

![Example2.1](https://s3.amazonaws.com/hr-challenge-images/22564/1467398392-5d9ac72e45-UntitledDiagram5.png)

## 🧠 Approach

1. Calculate from the front: Divide p by 2, as each turn covers two pages.
2. Calculate from the back:
   - If n is odd, the back turn formula is (n - p) / 2.
   - If n is even, use (n - p + 1) / 2.
3. Return the minimum of these two values.

## Time Complexity

O(1): We use a constant-time calculation with minimal operations.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out Me.
