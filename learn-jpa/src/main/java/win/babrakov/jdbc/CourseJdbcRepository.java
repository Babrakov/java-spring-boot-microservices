package win.babrakov.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import win.babrakov.model.Course;

@Repository
@RequiredArgsConstructor
public class CourseJdbcRepository {

    private static final String INSERT_QUERY = """
                    insert into course (id,name,author) 
                    values (?, ? , ?)
            """;
    private static final String DELETE_QUERY = """
                    delete from course where id=?
            """;
    private static final String SELECT_QUERY = """
                    select * from course where id=?
            """;
    private final JdbcTemplate jdbcTemplate;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        // ResultSet -> Bean => Row Mapper
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
