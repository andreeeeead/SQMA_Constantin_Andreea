import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SituatieStudentTest {

    @Test
    void calculMedie() {
        SituatieStudent situatieStudent = new SituatieStudent("Gigel", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 3)));
        assertEquals(6.25, situatieStudent.calculMedie());
    }

    @Test
    void eIntegralist() {
        SituatieStudent situatieStudent1 = new SituatieStudent("Gigel", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 9)));
        assertTrue(situatieStudent1.eIntegralist());
        SituatieStudent situatieStudent2 = new SituatieStudent("Gigica", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 3)));
        assertFalse(situatieStudent2.eIntegralist());
    }

    @Test
    void areBursa() {
        SituatieStudent situatieStudent1 = new SituatieStudent("Gigel", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 9)));
        assertFalse(situatieStudent1.areBursa());
        SituatieStudent situatieStudent2 = new SituatieStudent("Gigica", new ArrayList<Integer>(Arrays.asList(10, 9, 10, 9)));
        assertTrue(situatieStudent2.areBursa());
    }
}