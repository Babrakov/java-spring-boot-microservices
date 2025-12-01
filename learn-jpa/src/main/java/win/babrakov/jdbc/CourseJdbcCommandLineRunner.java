package win.babrakov.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import win.babrakov.model.Course;

@Component
@RequiredArgsConstructor
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1L, "Learn AWS", "in28minutes");
        repository.insert(course);
        repository.insert(new Course(2L,"Learn Java","Luxoft"));
        repository.insert(new Course(3L,"Learn English","Bob the Canadian"));

        repository.delete(course);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
