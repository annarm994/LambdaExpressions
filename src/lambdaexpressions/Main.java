package lambdaexpressions;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello from the Runnable Lambda Expression!");
        task.run();

        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Subtraction: " + subtract.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));
        System.out.println("Division: " + divide.operate(10, 5));

        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "David", "Eve"));
        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println("Sorted Names: " + names);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35));
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Filtered Numbers (Odd): " + numbers);

        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is 'Hello' empty? " + isEmpty.test("Hello"));
        System.out.println("Is '' empty? " + isEmpty.test(""));

        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase 'hello': " + toUpperCase.apply("hello"));

        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> multiplyByTen = x -> x * 10;
        Function<Integer, Integer> composedFunction = addOne.andThen(multiplyByTen);

        System.out.println("Compose Functions (add 1, then multiply by 10): " + composedFunction.apply(5));

        StringOperation concat = (s1, s2) -> s1 + s2;
        StringOperation longerString = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

        System.out.println("Concatenation of 'Hello' and 'World': " + concat.apply("Hello", "World"));
        System.out.println("Longer string between 'Hello' and 'World': " + longerString.apply("Hello", "World"));
    }
}
