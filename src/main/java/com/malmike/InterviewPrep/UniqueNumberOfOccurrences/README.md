# Unique Number of Occurrences

## Question

Given an array of integers <span style="color:red">arr</span>, write a function that returns <span style="color:red">true</span> if and only if the number of occurrences of each value in the array is unique.

### Example 1:

```
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
```

### Example 2:

```
Input: arr = [1,2]
Output: false
```

### Example 3:

```
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
```

Constraints:

- <span style="color:red">1 <= arr.length <= 1000</span>
- <span style="color:red">-1000 <= arr[i] <= 1000</span>

## Psuedo Code

```
- Push items to a map with the array item as the key and the value the number of times the item appears in the array.
- Push the values of the map to a set.
- Compare the size of the set to that of the map, if they are the same length then return true, otherwise return false.
```
