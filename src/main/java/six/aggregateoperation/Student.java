package six.aggregateoperation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {
    private String name;
    private double grade;
    private String department;
    private Gender gender;
}