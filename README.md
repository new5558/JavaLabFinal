# Working......
## Current Problems
lab 4's and code has not 100% adhered to the instruction (I added some modifications make the input correct?).  
need someone to review the code.
No PDF given due to copyright.

## Lab 4 (Binary Search + Recursive)
### Instruction from PDF
If position_left is equal to position_right, this means that the user-input value cannot be found in the array, so the method should return -1  
  
### Outcome 
StackOverFlow Error is throwed when position_right - pos_left == 1 because this will make position_center == position_left --> recursive call the same method

### My modification
by adding this code, StackOverFlow Error is gone. 
```java
if(value == currentValue) return pos_center; // already has this line before modification
if(pos_right - pos_left == 1) return -1; // according to the instructions, this line should be gone
```
another solution that works too(but still not adhere to the instrcutions):
https://www.geeksforgeeks.org/binary-search