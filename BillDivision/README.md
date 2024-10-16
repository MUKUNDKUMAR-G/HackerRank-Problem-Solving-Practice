# 🍽️ Bon Appetit (Bill Division) 🍽️

## 📖 Problem Statement

Anna and Brian are sharing a meal at a restaurant. The meal consists of `n` items, and each item has a specific cost. Anna and Brian decide to split the bill evenly, but Anna does not want to pay for one of the items she did not eat.

You need to determine how much money Anna should be reimbursed for the item she did not eat. If Anna has been charged the correct amount, print "Bon Appetit".

### **Input Format**

- The first line contains two space-separated integers, `n` (the number of items ordered) and `k` (the index of the item Anna did not eat).
- The second line contains `n` space-separated integers representing the costs of each item.
- The third line contains an integer, `b`, which is the amount of money Anna contributed to the bill.

### **Output Format**

Print the amount of money that Anna should be reimbursed. If Anna has been charged correctly, print "Bon Appetit".

## 📊 Examples

### Example 1

#### Input:

```
4 1
3 10 2 9
12

```

**Output:**

```java
5
```

### Explanation:

Anna will pay half the total cost of the meal minus the item she did not eat:

- Total cost = 3 + 10 + 2 + 9 = 24
- Cost Anna should pay = (24 - 10) / 2 = 7
- Since Anna contributed 12, she should be reimbursed 12 - 7 = 5.

### Example 2

#### Input

```
4 1
3 10 2 9
7

```

**Output:**

```java
Bon Appetit
```

#### Explanation:

- Total cost = 3 + 10 + 2 + 9 = 24
- Cost Anna should pay = (24 - 10) / 2 = 7
- Since Anna contributed 7, she is charged correctly.

## 🧠 Approach and Solution

1. Calculate the actual total: Sum up all the items except the one Anna didn't eat.
2. Divide by 2: To calculate Anna's actual share of the bill.
3. Compare: If the amount Brian charged her (b) is equal to Anna's share, print "Bon Appetit". Otherwise, print the difference between what Brian charged and Anna's share.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out to Your Name.
