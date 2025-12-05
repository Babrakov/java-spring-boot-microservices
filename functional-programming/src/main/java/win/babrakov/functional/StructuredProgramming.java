package win.babrakov.functional;

import java.util.List;

public class StructuredProgramming {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(13, 4, 15, 17, 18, 42, 13);
        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}