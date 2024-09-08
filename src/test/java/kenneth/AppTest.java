package kenneth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for verifying App function(s)
 */
class AppTest {

    @BeforeEach
    void setUp() {
        // Setting up variables before each unit test
    }

    @AfterEach
    void tearDown() {
        // Resetting variables after each unit test
    }

    @Test
    void sumOfTwoIntA() {
        int i = 1;
        int j = 2;

        int expectedResult = 3;
        int actualResult = App.sumOfTwoInt(1, 2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumOfTwoIntB() {
        int i = 9;
        int j = 47;

        int expectedResult = 56;
        int actualResult = App.sumOfTwoInt(9, 47);

        assertEquals(expectedResult, actualResult);
    }
}