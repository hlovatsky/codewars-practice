package six.aggregateoperation;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@UtilityClass
public class Operation {

    /*
    https://www.codewars.com/kata/595fa01cde9d341e8c000045
     */
    public static Map<String, Double> getAverageGrade(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.averagingDouble(Student::getGrade)));
    }

    /*
    https://www.codewars.com/kata/596092e42e8c8b5382000026
     */
    public static Map<String, Long> getStudentsSize(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.counting()));
    }

    /*
    https://www.codewars.com/kata/5960e6cf09868d7f2f0000bc
     */

    public static Map<String, List<String>> getStudentsNames(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())));
    }
}
