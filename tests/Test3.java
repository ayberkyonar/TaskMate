import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Date;

public class Test3 {

    @Test
    public void Test3() {
        Taak taak = new model.Test("Account testcases", "Dit is een test taak", "Gepland", new Date(), 8, 3);

        Assertions.assertEquals("De grootte van jouw taak is: Kleine taak", taak.testTaakFuncties("Kleine taak",true, true, true));
        Assertions.assertEquals("Vul de taaknaam in", taak.testTaakFuncties("Kleine taak",false, false, false));
        Assertions.assertEquals("Geen geldige taaktype ingevuld", taak.testTaakFuncties("Middelmatige taak",true, true, false));
        Assertions.assertEquals("Vul de taaknaam in", taak.testTaakFuncties("Middelmatige taak",false, false, true));
        Assertions.assertEquals("Deze taaknaam bestaat al", taak.testTaakFuncties("Grote taak",true, false, true));
        Assertions.assertEquals("Vul de taaknaam in", taak.testTaakFuncties("Grote taak",false, true, false));
    }
}
