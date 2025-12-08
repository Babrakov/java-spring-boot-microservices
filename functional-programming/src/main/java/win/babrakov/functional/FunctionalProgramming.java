package win.babrakov.functional;

import java.util.List;

public class FunctionalProgramming {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(13, 4, 15, 17, 18, 42, 13);
//        printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
        printCubeOfOddNumbersInListFunctional(numbers);

    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
}