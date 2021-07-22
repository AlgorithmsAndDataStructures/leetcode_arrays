# Minimum Number of Operations to Move All Balls to Each Box

## Question

You have <span style="color:red">n</span> boxes. You are given a binary string <span style="color:red">boxes</span> of length <span style="color:red">n</span>, where <span style="color:red">boxes[i]</span> is <span style="color:red">'0'</span> if the <span style="color:red">i<sup>th</sup></span> box is **empty**, and <span style="color:red">'1'</span> if it contains **one** ball.

In one operation, you can move **one** ball from a box to an adjacent box. Box <span style="color:red">i</span> is adjacent to box <span style="color:red">j</span> if <span style="color:red">abs(i - j) == 1</span>. Note that after doing so, there may be more than one ball in some boxes.

Return an array <span style="color:red">answer</span> of size <span style="color:red">n</span>, where <span style="color:red">answer[i]</span> is the **minimum** number of operations needed to move all the balls to the <span style="color:red">i<sup>th</sup></span> box.

Each <span style="color:red">answer[i]</span> is calculated considering the initial state of the boxes.

### Example 1:

```
Input: boxes = "110"
Output: [1,1,3]
Explanation: The answer for each box is as follows:

1. First box: you will have to move one ball from the second box to the first box in one operation.
2. Second box: you will have to move one ball from the first box to the second box in one operation.
3. Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.
```

### Example 2:

```
Input: boxes = "001011"
Output: [11,8,5,4,3,4]
```

Constraints:

- <span style="color:red">n == boxes.length</span>
- <span style="color:red">1 <= n <= 2000</span>
- <span style="color:red">boxes[i] is either '0' or '1'.</span>

## Psuedo Code

### Brute Force

```
function minimumOperations(String boxes){
  - Create array result of length boxes.length with 0 as initial values
  - set iterator i to 0;
  - set iterator j to 0;
  - iterate through boxes while incrementing i by 1{
    - if char at position i is '1'{
      - iterate through result while incrementing j by 1{
        - if i is not equal to j{
          - add the absolute value of i - j to the value at position j in result
        }
      }
    }
  }
  - return result
}
```

### Optimised Method

We know that as we iterate through the boxes at each position we have already determined the number of operations we need to move inorder to get all the balls before that into the previous position. From there we have to add the amount of operations needed to move those balls from the previous position to the current position which is the total number of balls.

To get those operations for those infront of the current position, we would have to do a similar kind of interation in reverse and add the two results at each position to get the final value

#### Solution

```
- create array result of length boxes
- assign ballsSeen equal to 0;
- assign previousOperations equal to 0;
- iterate i=0; i<boxes.length; i++{
  - assign operations = previousOperations + ballsSeen
  - result[i] = operations
  - if a ball exists boxes[i]
    - increment ballsSeen by one
  - previousOperations = operations
}

- assign ballsSeen equal to 0;
- assign previousOperations equal to 0;
- iterate i=boxes.length-1; i>=0; i++{
  - assign operations = previousOperations + ballsSeen
  - result[i] += operations
  - if a ball exists boxes[i]
    - increment ballsSeen by one
  - previousOperations = operations
}

return result
```
