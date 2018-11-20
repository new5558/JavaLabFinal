# Working......
## Current Problems
lab 4's and lab 6's code has not 100% adhered to the instruction (I added some modifications make the input correct?)

need someone to review the code.  
No PDF given due to copyright.

## Lab 4
### Instruction from PDF
If position_left is equal to position_right, this means that the user-input value cannot be found in the array, so the method should return -1  
  
### Outcome 
StackOverFlow Error is throwed when position_right - pos_left == 1 because this will make position_center == position_left --> recursive call the same method

### My modification
by adding this code, StackOverFlow Error is gone
```java
if(value == currentValue) return pos_center; // already has this line before modification
if(pos_right - pos_left == 1) return -1; // according to the instructions, this line should be gone
```
## Lab 6
### Instruction from PDF

![alt text](https://raw.githubusercontent.com/new5558/javaLabFinal/master/image.PNG)

### My modification
```java
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}
// not sure can be scored by implementing contructor or as not mentioned in the instruction
```
