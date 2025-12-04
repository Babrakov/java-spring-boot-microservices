package win.babrakov.functional;

import java.util.List;

public class StructuredProgramming {

    public static void main(String[] args) {

        printAllNumbersInListStructured(List.of(13,4,15,17,18,42,13));

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}