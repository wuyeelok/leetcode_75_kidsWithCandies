package kenneth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for verifying App function(s)
 */
class SolutionTest {

    private Solution solution;
    private List<Integer> candyList;
    private int extraCandies;

    @BeforeEach
    void setUp() {
        // Setting up variables before each unit test
        solution = new Solution();
        candyList = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        // Resetting variables after each unit test
    }

    @Test
    void example1() {
        candyList.add(2);
        candyList.add(3);
        candyList.add(5);
        candyList.add(1);
        candyList.add(3);

        extraCandies = 3;

        int[] candies = candyList.stream().mapToInt(i -> i).toArray();

        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        List<Boolean> actualResult = solution.kidsWithCandies(candies, extraCandies);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void example2() {
        candyList.add(4);
        candyList.add(2);
        candyList.add(1);
        candyList.add(1);
        candyList.add(2);

        extraCandies = 1;

        int[] candies = candyList.stream().mapToInt(i -> i).toArray();

        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(false);
        List<Boolean> actualResult = solution.kidsWithCandies(candies, extraCandies);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void example3() {
        candyList.add(12);
        candyList.add(1);
        candyList.add(12);

        extraCandies = 10;

        int[] candies = candyList.stream().mapToInt(i -> i).toArray();

        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);

        List<Boolean> actualResult = solution.kidsWithCandies(candies, extraCandies);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void example4() {
        candyList.add(2);
        candyList.add(8);
        candyList.add(7);

        extraCandies = 1;

        int[] candies = candyList.stream().mapToInt(i -> i).toArray();

        List<Boolean> expectedResult = new ArrayList<>();

        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);

        List<Boolean> actualResult = solution.kidsWithCandies(candies, extraCandies);

        assertEquals(expectedResult, actualResult);
    }
}