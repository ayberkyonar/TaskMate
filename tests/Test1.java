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
        Taak taak = new Gepland(titel, beschrijving, new Date());

        // Act
        String echteTitel = taak.getNaam();
        String echteBeschrijving = taak.getBeschrijving();

        // Assert
        Assertions.assertEquals(titel, echteTitel);
        Assertions.assertEquals(beschrijving, echteBeschrijving);
    }
}