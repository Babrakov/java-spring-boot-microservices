package win.babrakov.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Course {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;
}
