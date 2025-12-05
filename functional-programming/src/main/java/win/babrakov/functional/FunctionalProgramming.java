package win.babrakov.functional;

import java.util.List;

public class FunctionalProgramming {

    public static void main(String[] args) {

        printAllNumbersInListFunctional(List.of(13,4,15,17,18,42,13));

    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FunctionalProgramming::print);
    }
}