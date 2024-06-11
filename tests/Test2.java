import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Date;

public class Test2 {

    @Test
    public void Test2() {
        Taak taak = new Ontwerp("Account aanpassen mockup", "Dit is een ontwerp taak", "Bezig", new Date(), 5, "Adobe XD");

        Assertions.assertEquals("Kleine taak", taak.taakGrootte(4));
        Assertions.assertEquals("Middelmatige taak", taak.taakGrootte(5));
        Assertions.assertEquals("Middelmatige taak", taak.taakGrootte(9));
        Assertions.assertEquals("Grote taak", taak.taakGrootte(10));
    }
}
