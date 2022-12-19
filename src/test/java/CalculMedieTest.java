import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalculMedieTest {
    @Test
    void calculMedie() {
        SituatieStudent situatieStudent = new SituatieStudent("Gigel", new ArrayList<Integer>(Arrays.asList(5, 7, 10, 3)));
        assertEquals(6.25, situatieStudent.calculMedie());
    }
}