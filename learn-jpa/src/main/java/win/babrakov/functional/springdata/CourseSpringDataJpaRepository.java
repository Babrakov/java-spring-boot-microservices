package win.babrakov.functional.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import win.babrakov.functional.model.Course;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
