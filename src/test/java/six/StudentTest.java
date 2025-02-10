package six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import six.aggregateoperation.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    private static final String TECHNIC = "Technic";
    private static final String QUALITY = "Quality";

    private List<Student> students;

    @BeforeEach
    public void setUp() {
        students = List.of(
                new Student("Petro", 5.0, TECHNIC, Gender.MALE),
                new Student("Olha", 4.5, QUALITY, Gender.FEMALE),
                new Student("Vasil", 3.5, QUALITY, Gender.MALE),
                new Student("Odarka", 5.5, QUALITY, Gender.FEMALE)
        );
    }

    @Test
    void testAverageGradeByDepartment() {
        Map<String, Double> expectedResult = new HashMap<>();
        expectedResult.put(QUALITY, 4.5);
        expectedResult.put(TECHNIC, 5.0);
        Map<String, Double> actualResult = Operation.getAverageGrade(students);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStudentSizeByDepartment() {
        Map<String, Long> expectedResult = new HashMap<>();
        expectedResult.put(QUALITY, 3L);
        expectedResult.put(TECHNIC, 1L);
        Map<String, Long> actualResult = Operation.getStudentsSize(students);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStudentNamesByDepartment() {
        Map<String, List<String>> expectedResult = new HashMap<>();
        expectedResult.put(QUALITY, List.of("Olha", "Vasil", "Odarka"));
        expectedResult.put(TECHNIC, List.of("Petro"));
        Map<String, List<String>> actualResult = Operation.getStudentsNames(students);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGenderCountingInDepartment() {
        Map<String, Map<Gender, Long>> actualResult = Operation.getStudentsByGender(students);
        Map<String, Map<Gender, Long>> expectedResult = Map.of(
                QUALITY, Map.of(Gender.FEMALE, 2L, Gender.MALE, 1L),
                TECHNIC, Map.of(Gender.MALE, 1L)
        );
        assertEquals(expectedResult, actualResult);
    }
}
