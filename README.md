# KataTestProject

This project is a work assignment for [Kata Academy](https://kata.academy/java/postpayment). See entire Kata's task description [here](https://kataacademy.github.io/kata-program.io/task-calculator?b24form_user=1.208039-1681295815-95bf3c744bc804bf9d93d9f127fcd3906cfd97a030448a58eebfb2d06cb22e70).

### Description

Create a console application "Calculator". The application should read strings, numbers and arithmetic operations from the console enetered by an user.
The application should output the result of a calculation.

Implement the Main class with the public static String calc(String input) method. The method should take a string with an arithmetic expression between two numbers.
The method should return the result of their calculation.

Other imports, classes and methods are allowed. Added classes shouldn't contain access modifiers as public or others.

### Requirements

1. The calculator should be able to perform addition, subtraction, multiplication, and division operations with two numbers: a + b, a - b, a * b, a / b. 
Important! The expression is written in one string and solutions where every number and arithmetic operation are written on a new line are considered as incorrect.

2. The calculator should be able to manipulate with both Arabic (1,2,3,4,5...) and Roman (I,II,III,IV,V...) numerals.

3. The calculator should accept numbers from 1 to 10 inclusive, no more. The result is not limited in size and can be any number.

4. The calculator should work only with integers.

5. The calculator can work only with Arabic or Roman numerals at the same time. A string like 3 + II should throw an exception and should terminate work.

6. When entering Roman numerals, the answer should be output in Roman numerals. And when entering Arabic numerals, the answer is expected to be in Arabic.

7. When the user enters inappropriate numbers, the application should throw an exception and terminate work.

8. When the user enters a string that doesn't correspond to one of the above arithmetic operations, the application should throw an exception and terminate work.

9. The result of the division operation is an integer, the remainder is discarded.

10. The result of the calculator's operation with Arabic numerals can be negative numbers and zero. 
The result of the calculator's operation with Roman numerals can only be positive numbers. 
If the result of the operation is less than one, an exception should be thrown.

### Examples

``` 
Input:
1 + 2

Output:
3
```

```
Input:
VI / III

Output:
II
```

```
Input:
I - II

Output:
throws Exception //because in the Roman numeral system, there are no negative numbers.
```

```
Input:
I + 1

Output:
throws Exception //because different numerals are used at the same time.
```

```
Input:
1

Output:
throws Exception //because the string doesn't contain any arithmetical expression.
```

```
Input:
1 + 2 + 3

Output:
throws Exception //because the input doesn't match the task requirements: 2 operands и 1 operator (+, -, /, *).
```
