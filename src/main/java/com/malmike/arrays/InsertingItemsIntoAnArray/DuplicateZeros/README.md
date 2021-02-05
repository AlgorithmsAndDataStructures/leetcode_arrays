# Duplicate Zeros
## Question
Given a fixed length array <span style="color:red">arr</span> of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.



### Example 1:
~~~
Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
~~~
### Example 2:
~~~
Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
~~~


### Note:

1. <span style="color:red">1 <= arr.length <= 10000</span>
2. <span style="color:red">0 <= arr[i] <= 9</span>

## Psuedo Code
```
This function pushes all items in an array from position i to the right
function shiftArrayValues(Array array, Integer position){
  set value of position to currentValue
  while position is less than array length minus one:
    set value of position plus one to nextValue
    assign value of position plus one to that of currentValue
    assign value of currentValue to that of next value
    increase position by one
}

This function duplicates zeros in an array
function duplicateZeros(Array array){
  set iterator i to 0
  while i is less than array length minus one:
    if value of array at position i is 0:
      set position to i plus 1
      call shifyArrayValues(array, position)
      assign value of array at position i + 1 to 0
      increment i by 1
    increment i by 1
}
```

### Method 2
Iterate through the array and find the position of the item that will take the last position when the zeros are duplicated.
Iterate in reverse, passing the items from the position got to the start of the array while duplicating the zeros.
```
function derivePositonOfLastItem(Array array){
  set position to 0
  set iterator i to 0
  while position is less than array length:
    if value of array at position i is 0:
      increment position by 1
    increment position by 1
    increment i by 1
  return i
}

function duplicateZeros(Array array){
  set lastItem to value returned by derivePositionOfLastItem(array) minus 1
  set iterator i to array.length - 1;
  while lastItem is not equal to i:
    if value of array at lastItem is equal to zero:
      set value of array at i to 0
      decrement i by 1
    set value of array at i to value of array at lastItem
    decrement i by 1
    decrement lastItem by 1
}

```
