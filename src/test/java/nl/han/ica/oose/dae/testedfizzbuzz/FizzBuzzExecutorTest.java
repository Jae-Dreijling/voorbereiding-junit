package nl.han.ica.oose.dae.testedfizzbuzz;
import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
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
        var number = 37;
        // Act
        var testValue = sut.execute(number);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithFizzTest() {
        // Arrange
        var number = 9;
        // Act
        var testValue = sut.execute(number);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeWithBuzzTest() {
        // Arrange
        var number = 10;
        // Act
        var testValue = sut.execute(number);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeWithFizzBuzzTest() {
        // Arrange
        var number = 15;
        // Act
        var testValue = sut.execute(number);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }


}




