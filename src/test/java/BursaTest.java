import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BursaTest {
    @Test
    void areBursa() {
        SituatieStudent situatieStudent1 = new SituatieStudent("Gigel", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 9)));
        assertFalse(situatieStudent1.areBursa());
        SituatieStudent situatieStudent2 = new SituatieStudent("Gigica", new ArrayList<Integer>(Arrays.asList(10, 9, 10, 9)));
        assertTrue(situatieStudent2.areBursa());
    }
}