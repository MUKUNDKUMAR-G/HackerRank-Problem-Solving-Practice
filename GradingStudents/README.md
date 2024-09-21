# 🎓 Grading 🎓

## 📖 Problem Statement

In this problem, you are given a list of students' grades. You need to round each student's grade according to the following rules:

- If the difference between the grade and the next multiple of 5 is less than 3, round the grade up to the next multiple of 5.
- If the grade is less than 38, it is not rounded because it is failing.

### Example

- Input: `grades = [73, 67, 38, 33]`
- Output: `[75, 67, 40, 33]`

### Explanation

- 73 rounds to 75 (next multiple of 5).
- 67 remains 67 (less than 3 to the next multiple).
- 38 rounds to 40.
- 33 remains 33 (less than 38).

## 🛠️ Function Description

### `gradingStudents(List<Integer> grades)`

- **Parameters:**

  - `List<Integer> grades`: A list of integers representing the grades.

- **Returns:**
  - A list of integers representing the rounded grades.

## 📥 Input Format

- The first line contains an integer `n`, the number of students.
- The next `n` lines contain integers representing the grades.

## 📤 Output Format

- Print the rounded grades, each on a new line.

## 📊 Example

### Input

```
4
73
67
38
33

```

**Output:**

```java
75
67
40
33
```

### Explanation

![Example](https://s3.amazonaws.com/hr-challenge-images/0/1484768684-54439977a1-curving2.png)

- For the grade 73, the next multiple of 5 is 75, and since the difference is 2 (which is less than 3), it rounds to 75.
- For the grade 67, the next multiple of 5 is 70, and the difference is 3 (which is not less than 3), so it remains 67.
- For the grade 38, the next multiple of 5 is 40, and the difference is 2 (which is less than 3), so it rounds to 40.
- For the grade 33, the next multiple of 5 is 35, and the difference is 2 (which is less than 3), so it rounds to 33.

## 🧠 Approach

The solution involves the following steps:

1. Input Reading: Read the total number of grades and the grades themselves.
2. Rounding Logic: For each grade:
   - If the grade is less than 38, it remains unchanged.
   - For grades 38 and above, calculate the next multiple of 5.
   - If the difference between the grade and this multiple is less than 3, round the grade up.
3. Output the Results: Print each rounded grade.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
