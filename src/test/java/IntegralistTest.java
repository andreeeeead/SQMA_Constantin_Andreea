import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntegralistTest {
    @Test
    void eIntegralist() {
        SituatieStudent situatieStudent1 = new SituatieStudent("Gigel", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 9)));
        assertTrue(situatieStudent1.eIntegralist());
        SituatieStudent situatieStudent2 = new SituatieStudent("Gigica", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 3)));
        assertFalse(situatieStudent2.eIntegralist());
    }
}