/*
import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

public class Test1 {

    @Test
    public void Test1 () {
        // Arrange
        String titel = "Test Taak";
        String beschrijving = "Dit is een test taak";
        String status = "In progress";
        String programmeerTaal = "Java";
        int aantalKlassen = 2;
        Taak taak = new Programmeer(titel, beschrijving, status, new Date(), programmeerTaal, aantalKlassen);

        // Act
        String echteTitel = taak.getNaam();
        String echteBeschrijving = taak.getBeschrijving();
        String echteStatus = taak.getStatus();
        String echteProgrammeerTaal = ((Programmeer) taak).getProgrammeerTaal();
        int echteAantalKlassen = ((Programmeer) taak).getAantalKlassen();

        // Assert
        Assertions.assertEquals(titel, echteTitel);
        Assertions.assertEquals(beschrijving, echteBeschrijving);
        Assertions.assertEquals(status, echteStatus);
        Assertions.assertEquals(programmeerTaal, echteProgrammeerTaal);
        Assertions.assertEquals(aantalKlassen, echteAantalKlassen);
    }
}*/
