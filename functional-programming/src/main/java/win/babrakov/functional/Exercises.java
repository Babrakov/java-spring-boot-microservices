package win.babrakov.functional;

import java.util.List;

public class Exercises {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker", "Kubernetes");
        printAllCourses(courses);
        printCoursesWithSpring(courses);
        printCoursesWithAtLeastFourLetters(courses);

    }

    private static void printCoursesWithAtLeastFourLetters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printCoursesWithSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.forEach(System.out::println);
    }

}