package win.babrakov.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import win.babrakov.model.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
