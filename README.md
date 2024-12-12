# Java Lambda Expressions Assignment

## Objective:
The objective of this project is to demonstrate the usage of lambda expressions in Java, including their application in functional interfaces, collections, and advanced usage scenarios.

## Project Structure:
- **MathOperation.java**: A functional interface that defines a method for mathematical operations.
- **StringOperation.java**: A custom functional interface for string operations.
- **Main.java**: The main class where lambda expressions are used to implement various tasks like mathematical operations, string operations, sorting, and filtering collections.

## Tasks Implemented:
1. **Task 1**: Runnable Interface with a lambda expression.
2. **Task 2**: Custom `MathOperation` interface with lambda expressions for addition, subtraction, multiplication, and division.
3. **Task 3**: Sorting and filtering collections with lambda expressions.
4. **Task 4**: Using built-in functional interfaces like `Predicate` and `Function`.
5. **Task 5**: Advanced usage of lambda expressions including composing functions and custom string operations.

## Instructions to Run:
1. Clone or download the repository.
2. Compile the Java files:
javac src/MathOperation.java src/StringOperation.java src/Main.java
3. Run the program:
java -cp src lambdaexpressions.Main

The program will display the results of the tasks, including mathematical operations, sorted and filtered lists, string manipulations, and function compositions.

## Test Cases:
- Task 1: Runnable Lambda Expression outputs a greeting message.
- Task 2: Performs addition, subtraction, multiplication, and division operations with lambda expressions.
- Task 3: Sorts a list of strings and filters out even numbers from a list of integers.
- Task 4: Checks if a string is empty using `Predicate`, and converts a string to uppercase using `Function`.
- Task 5: Composes two functions using `andThen` and demonstrates custom string operations like concatenation and finding the longer string.
