package nl.han.ica.oose.dae.testedfizzbuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup() {
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest() {
        // Arrange
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzTest() {
        // Arrange
        // Act
        var testValue = sut.execute(9);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzTest() {
        // Arrange
        // Act
        var testValue = sut.execute(10);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzTest() {
        // Arrange
        // Act
        var testValue = sut.execute(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }


}




