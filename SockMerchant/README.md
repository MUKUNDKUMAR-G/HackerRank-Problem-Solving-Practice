# 🧦 Sock Merchant 🧦

## 📖 Problem Statement

There is a large pile of socks that must be paired by color. You will be given an array of integers representing the colors of the socks. Your task is to determine how many pairs of socks with matching colors can be formed.

### **Function Description**

```
sockMerchant(int n, int[] ar):

Parameters:
n: the number of socks.
ar: an array of integers representing the colors of each sock.

Returns:
An integer representing the total number of matching pairs.

```

### **Input Format**

- An integer n (the number of socks).
- An integer array ar where each element represents a sock color.

### **Output Format**

- An integer representing the number of matching sock pairs.

## 📊 Examples

### Example 1

#### Input:

```
n = 9
ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
```

**Output:**

```java
3
```

### Explanation:

![Example1](https://s3.amazonaws.com/hr-challenge-images/25168/1474122392-c7b9097430-sock.png)

There are three pairs: (10, 10), (20, 20), and (10, 10).

## 🧠 Approach

1. Use a HashSet to keep track of unmatched socks.
2. For each sock color:
   - If the sock is in the set, it forms a pair, so remove it and increase the pair count.
   - If not, add it to the set.
3. The result is the total number of pairs.

## Time and Space Complexity

- Time Complexity: O(n), where n is the number of socks.
- Space Complexity: O(n), for storing unmatched socks in the set.

## 🤗 Contributions

Contributions are welcome! Feel free to create issues or submit pull requests.

## 📧 Contact

For any queries, reach out Me.
