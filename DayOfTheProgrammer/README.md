# 📅 Day of the Programmer 📅

## 📖 Problem Statement

Marie invented a [Time Machine](https://en.wikipedia.org/wiki/Time_machine) and wants to test it by time-traveling to visit Russia on the [Day of the Programmer](https://en.wikipedia.org/wiki/Day_of_the_Programmer) (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the [Julian calendar](https://en.wikipedia.org/wiki/Julian_calendar); since 1919 they used the [Gregorian calendar](https://en.wikipedia.org/wiki/Gregorian_calendar) system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:

- Divisible by 400.
- Divisible by 4 and not divisible by 100.

Given a year, `y`, find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y.

For example, the given `year = 1984`. 1984 is divisible by 4, so it is a leap year. The 256th day of a leap year after 1918 is September 12, so the answer is `12.09.1984`.

### **Input Format**

A single integer representing the year.

### **Output Format**

Print the date of the 256th day in the format `dd.mm.yyyy`.

## 📊 Examples

### Example 1

#### Input:

```
2017

```

**Output:**

```java
13.09.2017
```

### Explanation:

The 256th day of the year 2017 is September 13.

### Example 2

#### Input

```
2016

```

**Output:**

```java
12.09.2016
```

#### Explanation:

The 256th day of the year 2016 is September 12 (leap year).

### Example 3

#### Input

```
1800

```

**Output:**

```java
12.09.1800
```

#### Explanation:

12.09.1800

### Example 3

#### Input

```
1918

```

**Output:**

```java
26.09.1918
```

#### Explanation:

In 1918, the transition from the Julian to the Gregorian calendar caused February to have only 15 days, making September 26 the 256th day.

## 🧠 Approach and Solution

**1. Understand Leap Years:**

    - Julian Calendar (before 1918): Leap year if divisible by 4.
    - Gregorian Calendar (1919 onwards): Leap year if divisible by 400 or divisible by 4 but not by 100.
    - Special Year 1918: This year had a transition from the Julian calendar to the Gregorian, causing the 256th day to be 26th September.

**2. Day of the Programmer:**

    - In a common year, the 256th day falls on 13th September.
    - In a leap year, the 256th day falls on 12th September.
    - In 1918, the 256th day falls on 26th September.

**3.Steps:**

    - For years before 1918, check the leap year rule of the Julian calendar.
    - For years after 1918, use the leap year rule of the Gregorian calendar.
    - Handle 1918 as a special case.

\***\*Solution:\*\***

```java
    String date = "";

    if (year == 1918) {
        // Special case for the transition year 1918
          date = "26.09.1918";
    } else if (year < 1918) {
        // Julian calendar
        if (year % 4 == 0) {
            date = "12.09." + year;
        } else {
            date = "13.09." + year;
        }
    } else {
        // Gregorian calendar
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            date = "12.09." + year;
        } else {
            date = "13.09." + year;
        }
    }

    return date;
```

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
