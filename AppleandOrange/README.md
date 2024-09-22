# 🍏 Apple and Orange 🍊

![Apple and Orange](https://s3.amazonaws.com/hr-challenge-images/25220/1474218925-f2a791d52c-Appleandorange2.png) 

## 📖 Problem Statement

Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

#### In the diagram Above:

- The red region denotes the house, where `s` is the start point, and  `t` is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.

- Assume the trees are located on a single point, where the apple tree is at point `a`, and the orange tree is at point `b`.

- When a fruit falls from its tree, it lands `d` units of distance from its tree of origin along the `x`-axis. *A negative value of  `d` means the fruit fell `d` units to the tree's left, and a positive value of `d` means it falls  `d` units to the tree's right. *

Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house (i.e..
in the inclusive range [s, t])?

`For example,` Sam's house is between `s = 7` and `t = 10`. The apple tree is located at `a = 4` and the orange at `b = 12`.

There are `m = 3` apples and `n = 3` oranges. Apples are thrown `apples = [2, 3, -4]` units distance from a. and
`oranges = [3, -2, -4]` units distance. 

Adding each apple distance to the position of the tree, they land at
[4 + 2, 4 + 3, 4 + -4] = [6, 7, 0]. Oranges land at [12 + 3, 12 + -2, 12 + -4] = [15, 10, 8]. One apple and two
oranges land in the inclusive range 7 - 10 

``` 
so we print

1
2
```

You are given the following:
- The locations of Sam's house, the apple tree, and the orange tree.
- The distances at which each apple and orange falls relative to their respective trees.

Your task is to find out how many apples and oranges land on Sam's house.

### Input Format

The first line contains three space-separated integers: `s`, `a`, and `b`, representing the location of Sam's house, the apple tree, and the orange tree, respectively.

The second line contains two space-separated integers: `m` and `n`, representing the number of apples and oranges, respectively.

The third line contains `m` space-separated integers, representing the distances of each apple from the apple tree.

The fourth line contains `n` space-separated integers, representing the distances of each orange from the orange tree.

### Output Format

Print two space-separated integers: the first integer should represent the number of apples that fall on Sam's house, and the second integer should represent the number of oranges that fall on Sam's house.

### Example

#### Input
```
s, t = 7, 11
a, b = 5, 15
apples = [-2, 2, 1]
oranges = [5, -6]

```

**Output:**
```java
1 1
```


### Explanation
In this case:
- The apple at distance `-2` falls at `11 - 2 = 9`, which does not land on Sam's house.
- The apple at distance `2` falls at `11 + 2 = 13`, which does not land on Sam's house.
- The apple at distance `1` falls at `11 + 1 = 12`, which does not land on Sam's house.
- The orange at distance `5` falls at `15 + 5 = 20`, which does not land on Sam's house.
- The orange at distance `-1` falls at `15 - 1 = 14`, which does not land on Sam's house.
- The orange at distance `1` falls at `15 + 1 = 16`, which does not land on Sam's house.

## 🛠️ Function Description

### `countFruits(int s, int a, int b, List<Integer> apples, List<Integer> oranges)`

- **Parameters:**
  - `int s`: The location of Sam's house.
  - `int a`: The location of the apple tree.
  - `int b`: The location of the orange tree.
  - `List<Integer> apples`: The distances of the apples from the apple tree.
  - `List<Integer> oranges`: The distances of the oranges from the orange tree.

- **Returns:**
  - An integer array where the first element is the number of apples that fall on Sam's house and the second element is the number of oranges that fall on Sam's house.

## 📥 Input Format
- Three space-separated integers: `s`, `a`, `b`.
- Two space-separated integers: `m`, `n`.
- A list of `m` integers representing the distances of apples.
- A list of `n` integers representing the distances of oranges.

## 📤 Output Format
- Print two space-separated integers representing the number of apples and oranges that fall on Sam's house.

## 🧠 Approach
The solution involves the following steps:
1. For each apple, calculate its landing position by adding its distance to the apple tree's position.
2. Check if the landing position is within the range of Sam's house.
3. Repeat the same for oranges.
4. Count and return the number of apples and oranges that land on Sam's house.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.


## 📧 Contact

For any queries, reach out to Your Name.
