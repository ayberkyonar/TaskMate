import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Date;

public class Test2 {

    @Test
    public void Test2() {
        // Arrange
        Sprint sprint = new Sprint("Test Sprint");
        Taak taak = new Gepland("Test Taak", "Dit is een test taak", 5 , new Date());

        // Act
        sprint.addTaak(taak);

        // Assert
        Assertions.assertTrue(sprint.getTaken().contains(taak));
    }

}
