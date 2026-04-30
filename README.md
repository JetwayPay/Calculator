EADME.md
# Java Calculator App

## Overview

The Java Calculator App is a beginner-friendly console application that allows a user to enter two numbers and choose a math operation. The app can add, subtract, multiply, or divide the numbers and then display the result.

This project was created as a simple Java programming project to practice basic coding concepts and add a working application to a GitHub portfolio.

## Features

- Takes input from the user
- Allows the user to enter `num1`
- Allows the user to choose an operation
- Allows the user to enter `num2`
- Supports addition
- Supports subtraction
- Supports multiplication
- Supports division
- Prevents division by zero
- Displays an error message for invalid operations

## Technologies Used

- Java
- IntelliJ IDEA
- Git
- GitHub

## How the App Works

The program asks the user to enter:

1. `num1`
2. An operation symbol
3. `num2`

The user can choose one of these operations:

```text
+  Addition
-  Subtraction
*  Multiplication
/  Division

After the user enters the two numbers and the operation, the program calculates and displays the result.

Example Run
Enter num1: 10
Enter operation (+, -, *, /): +
Enter num2: 5
Result: 15.0

Another example:

Enter num1: 20
Enter operation (+, -, *, /): /
Enter num2: 4
Result: 5.0

Division by zero example:

Enter num1: 10
Enter operation (+, -, *, /): /
Enter num2: 0
Error: Cannot divide by zero.
Project Structure
Calculator/
│
├── src/
│   └── Calculator.java
│
└── README.md
Code Concepts Used

This project demonstrates beginner Java concepts, including:

Classes
The main method
Variables
double data type
char data type
User input with Scanner
Conditional logic
switch statements
Basic arithmetic operations
Error handling for division by zero
Main Java File

The main file for this project is:

Calculator.java
How to Run the App in IntelliJ IDEA
Open IntelliJ IDEA.
Open the Calculator project.
Make sure the project has a Java JDK selected.
Open:
src/Calculator.java
Click the green play button next to the main method.
Select:
Run 'Calculator.main()'
Enter the numbers and operation when prompted in the console.
How to Run the App from the Terminal

First, make sure you are inside the project folder.

Compile the Java file:

javac src/Calculator.java

Run the program:

java -cp src Calculator
Example Code
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operation;
        double result;

        System.out.print("Enter num1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter num2: ");
        num2 = scanner.nextDouble();

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        scanner.close();
    }
}
What I Learned

While building this project, I practiced:

Creating a Java class
Writing a main method
Using Scanner to collect user input
Storing user input in variables
Using double for decimal-friendly calculations
Using char to store a math operation
Using a switch statement to choose what calculation to run
Handling invalid operations
Preventing division by zero
Running a Java program in IntelliJ IDEA
Committing and pushing a project to GitHub
Future Improvements

Possible future improvements include:

Add a graphical user interface
Allow the user to perform multiple calculations without restarting the app
Add more operations such as exponents or square roots
Add input validation for non-number entries
Format results to remove unnecessary .0 when possible
Add unit tests
Create a packaged executable version
Author

Created by Larrell Thornton as a beginner Java project for programming practice and GitHub portfolio development.

License

This project is for educational and portfolio purposes.
