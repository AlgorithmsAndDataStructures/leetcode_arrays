# Find Numbers with Even Number of Digits
## Question
Given an array nums of integers, return how many of them contain an even number of digits.

### Example 1:
~~~
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
~~~

### Example 2:
~~~
Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
~~~

### Constraints:
- 1 <= nums.length <= 500
- 1 <= nums[i] <= 10^5

### Hints
#### Hint 1:
How to compute the number of digits of a number ?
#### Hint 2:
Divide the number by 10 again and again to get the number of digits.

## Sudo Code
Separate the functionality for determining the length of the number and that to loop through the array and determine values that are even or not

### Function to determine length of number as numberLength
*Notes*: The log (taking log of base 10) of a positive number returns a value which after excluding the decimal places is less than the length of the number by 1.

```
- Get the absolute value of the number passed as absNum
- Get the log of absNum as lNum
- Get the floor value of lNum as fLNum // removes the decimal points from lNum
- Return fLNum + 1
```

### Function to determine numbers with number of digits in an array
```
- Set evenCounter to zero
- Loop through the array assigning each value to num
  - Using numberLength determine the length of num as lenNum
  - If the modulus of lenNum and 2 is zero increment evenCounter by 1
- Return evenCounter
```
