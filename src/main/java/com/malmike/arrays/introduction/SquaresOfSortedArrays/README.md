# Squares of a Sorted Array

## Question

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

### Example 1:

```
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
```

### Example 2:

```
Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```

### Note:

1. <span style="color:red">1 <= A.length <= 10000</span>
2. <span style="color:red">-10000 <= A[i] <= 10000</span>
3. <span style="color:red">A</span> is sorted in non-decreasing order.

## Sudo Code

```
- Check the first item in the array,
  - if it's a negative apply mergeSort
  - else
    - iterate through the array while squaring the values in the array.
```

### Utilising merge sort

Merge Sort is to ensure that the values that are squared are sorted especially if the initial array has negative values

#### Merge Sort

This is divided into spliting the array into individual elements and merging the elements after. In this case when we divide the elements to individual elements, we will return the square of the element.

##### Merge Function

```
- Taking two sorted arrays array1 and array2
  - Create resulting array as array3 of length equal to the total length of array1 and array2
  - Set iterator of array1 to i1 and that of array2 to i2
  - while i1 is less than array1 length and i2 is less than array2 length
    - if the value of array1 at position i1 is less than that of array2 at position i2
      - push the value of array1 at position i1 to array3
      - increment i1 by one
    - else
      - push the value of array2 at position i2 to array3
      - increment i2 by one
  - if i1 is less than array1 length
    - iterate through array1 from position i1 to array1 length and add the values at those positions to array3
  - if i2 is less than array2 length
    - iterate through array2 from position i2 to array2 length and add the values at those positions to array3
  - return array3
```

##### MergeSort function

```
- Taking an array, startIndex, endIndex
  - If startIndex is equal to endIndex
    - If startIndex is equal to array length
      - return empty array
    - else return the square of the value at startIndex in an array.
  - Get the midpoint between startIndex and endIndex, i.e add startIndex and endIndex and divide by two.
  - Split all values to the left of the midpoint by calling the function MergeSort to all values from the startIndex to the midpoint as leftSplit
  - Split all values to the right of the midpoint by calling the function MergeSort to all values from the midpoint+1 to the endpoint as rightSplit
  - return the merge of leftSplit and rightSplit
```
