package win.babrakov.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Course {

    private Long id;
    private String name;
    private String author;
}
