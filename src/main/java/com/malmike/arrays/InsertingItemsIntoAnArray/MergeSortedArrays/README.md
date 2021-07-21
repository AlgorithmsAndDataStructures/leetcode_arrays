# Merge Sorted Array

## Question

Given two sorted integer arrays <span style="color:red">nums1</span> and <span style="color:red">nums2</span>, merge <span style="color:red">nums2</span> into <span style="color:red">nums1</span> as one sorted array.

The number of elements initialized in <span style="color:red">nums1</span> and <span style="color:red">nums2</span> are <span style="color:red">m</span> and <span style="color:red">n</span> respectively. You may assume that <span style="color:red">nums1</span> has a size equal to m + n such that it has enough space to hold additional elements from <span style="color:red">nums2</span>.

### Example 1:

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
```

### Example 2:

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
```

### Constraints:

- <span style="color:red">nums1.length == m + n</span>
- <span style="color:red">nums2.length == n</span>
- <span style="color:red">0 <= m, n <= 200</span>
- <span style="color:red">1 <= m + n <= 200</span>
- <span style="color:red">-109 <= nums1[i], nums2[i] <= 109</span>

## Psuedo Code

```
This function pushes all items in an array from position i to the right
function shiftArrayValues(Array array, Integer arrayLength, Integer position){
  set value of position to currentValue
  while position is less than array length minus one:
    set value of position plus one to nextValue
    assign value of position plus one to that of currentValue
    assign value of currentValue to that of next value
    increase position by one
  set value at arrayLength to currentValue
}

This function adds items into array
function mergeSortedArrays(Array arr1, int lArr1, Array arr2, int lArr2){
  set iterator i to 0
  set iterator j to 0
  while i is less than lArr1 and lArr1 < arr1.length:
    if arr1[i] < arr2[j]:
      i = i+1;
    else:
      set position to i
      shiftArrayValues(arr1, lArr1, position)
      assign value of i to that of arr2[j];
      i = i+1;
      j = j+1;
      lArr1 = lArr1 + 1;

  if j is not equal to lArr2:
    while lArr1 < arr1. length:
      assign arr1[lArr1] to that of arr2[j];
      j = j+1;
      lArr1 = lArr1 + 1;
}
```

### Method 2 Optimised solution

Iterate though both arrays starting from the last element comparing the two and placing the one that is greater at the end and move a step down that array till all elements in the second array are done.
