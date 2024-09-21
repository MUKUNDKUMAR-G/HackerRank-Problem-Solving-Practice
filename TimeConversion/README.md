# ⏰ Time Conversion ⏰

## 📖 Problem Statement

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

**Note:**

- `12:00:00AM` on a 12-hour clock is `00:00:00` on a 24-hour clock.
- `12:00:00PM` on a 12-hour clock is `12:00:00` on a 24-hour clock.

### Example

- Input: `s = '12:01:00PM'`
- Output: `'12:01:00'`

- Input: `s = '12:01:00AM'`
- Output: `'00:01:00'`

## 🛠️ Function Description

### `timeConversion(String s)`

- **Parameters:**

  - `String s`: A time in 12-hour format (i.e., `hh:mm:ssAM` or `hh:mm:ssPM`).

- **Returns:**
  - `String`: The time in 24-hour format.

## 📥 Input Format

- A single string `s` that represents a time in 12-hour clock format.

## 📤 Output Format

- A string representing the time in 24-hour clock format.

## 📊 Example

### Input

```
07:05:45PM

```

**Output:**

```java
19:05:45
```

### Explanation

The time `07:05:45PM` is converted to `19:05:45` in military time.

## 🧠 Approach

The solution involves the following steps:

1. Extract the period (AM/PM) from the input string.
2. Parse the hours from the string.
3. Convert the hours based on the following rules:
   - If the time is PM and the hour is not 12, add 12 to the hour.
   - If the time is AM and the hour is 12, set the hour to 0.
4. Format the hour to ensure it is always two digits.
5. Append the remaining part of the time (minutes and seconds) and return the final result.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
