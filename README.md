# Working......

lab 4's and lab 6's code has not fully adhered with the instruction. (I add some modifications to improve the code?)

need someone to review the code.
No PDF given due to copyright.

## Lab 4

### Instruction
If position_left is equal to position_right, this means that the user-input value cannot be found in the array, so the method should return -1  
  
### Outcome 
StackOverFlow Error throwed when position_right - pos_left == 1 because recursive call position_center == position_left --> recursive call the same method

### My modification
using this code, StackOverFlow Error is gone
```java
if(value == currentValue) return pos_center; // already has this line before modification
if(pos_right - pos_left == 1) return -1; // according to the instructions, this line should be gone
```
## Lab 6
### Instruction

![alt text](https://raw.githubusercontent.com/new5558/javaLabFinal/master/image.PNG)

### My modification
```java
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}
// not sure can implemented contructor or not as not mentioned in the instruction
```
