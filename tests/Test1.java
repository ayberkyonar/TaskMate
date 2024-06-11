import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

public class Test1 {

    @Test
    public void Test1 () {
        Taak taak = new Programmeer("Account aanpassen", "Dit is een programmeer taak", "Klaar", new Date(), "JavaScript", 4);

        Assertions.assertTrue(taak.testTaakInvoer(true, true, true));
        Assertions.assertFalse(taak.testTaakInvoer(true, true, false));
        Assertions.assertFalse(taak.testTaakInvoer(true, false, true));
        Assertions.assertFalse(taak.testTaakInvoer(false, true, false));
    }
}
