package six;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListFilterTest {

    ListFilter filter = new ListFilter();

    @Test
    void testListFilter() {
        List<Object> list1 = List.of(1, 2, "a", "b");
        assertEquals(List.of(1, 2), filter.filterInteger(list1));

        List<Object> list2 = List.of(1, "a", "b", 0, 15);
        assertEquals(List.of(1,0,15), filter.filterInteger(list2));

        List<Object> list3 = List.of(1, 2, "a", "b", "aasf", "1", "123", 123);
        assertEquals(List.of(1, 2, 123), filter.filterInteger(list3));
    }
}
