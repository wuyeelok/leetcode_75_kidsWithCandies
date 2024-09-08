package kenneth;

import java.util.*;

/**
 * Main class for defining the required function(s).
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 2 <= candies.length <= 100
        // 1 <= candies[i] <= 100
        // 1 <= extraCandies <= 50

        List<Boolean> checkResult = new ArrayList<>();

        // Find out the max value in the list
        List<Integer> myCList = new ArrayList<>();
        for (int candy : candies) {
            myCList.add(candy);
        }
        int max = Collections.max(myCList);

        // check if adding extraCandies greater than the max
        for (int candy : candies) {

            if (candy + extraCandies >= max) {
                checkResult.add(true);
            } else {
                checkResult.add(false);
            }

        }


        return checkResult;
    }


}
