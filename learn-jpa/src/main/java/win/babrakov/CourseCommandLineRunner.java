package win.babrakov;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import win.babrakov.jpa.CourseJpaRepository;
import win.babrakov.model.Course;

@Component
@RequiredArgsConstructor
public class CourseCommandLineRunner implements CommandLineRunner {

//    private final CourseJdbcRepository repository;
    private final CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1L,"Learn AWS", "Learn Java"));
        repository.insert(new Course(1L,"Learn AWS", "Learn Java"));
        repository.insert(new Course(2L,"Learn AWS", "Luxoft"));
        repository.insert(new Course(3L,"Learn English","Bob the Canadian"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));

    }
}
