package win.babrakov;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import win.babrakov.jpa.CourseJpaRepository;
import win.babrakov.model.Course;
import win.babrakov.springdata.CourseSpringDataJpaRepository;

@Component
@RequiredArgsConstructor
public class CourseCommandLineRunner implements CommandLineRunner {

//    private final CourseJdbcRepository repository;
//    private final CourseJpaRepository repository;
    private final CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1L,"Learn AWS", "Learn Java"));
        repository.save(new Course(1L,"Learn AWS", "Learn Java"));
        repository.save(new Course(2L,"Learn AWS", "Luxoft"));
        repository.save(new Course(3L,"Learn English","Bob the Canadian"));

        repository.deleteById(1L);
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

    }
}
