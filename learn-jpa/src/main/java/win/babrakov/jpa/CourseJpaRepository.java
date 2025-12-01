package win.babrakov.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import win.babrakov.model.Course;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(Integer id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(Integer id) {
        entityManager.remove(findById(id));
    }

}
