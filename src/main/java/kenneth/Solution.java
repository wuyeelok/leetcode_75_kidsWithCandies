package kenneth;

import java.util.ArrayList;
import java.util.List;

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

        for (int i = 0; i < candies.length; i++) {
            int maxCandiesIndex = getMaxCandiesIndex(candies, extraCandies, i);

            // After looping, check if maxCandiesIndex equals to target index
            if (i == maxCandiesIndex) {
                checkResult.add(true);
            } else {
                checkResult.add(false);
            }

        }


        return checkResult;
    }

    private static int getMaxCandiesIndex(int[] candies, int extraCandies, int i) {
        int maxCandies = 0;
        int maxCandiesIndex = 0;

        for (int j = 0; j < candies.length; j++) {

            int checkingCandies = candies[j];

            if (i == j) {
                // if checking one, add the extra candies
                checkingCandies = checkingCandies + extraCandies;
            }

            if (checkingCandies > maxCandies) {
                maxCandies = checkingCandies;
                maxCandiesIndex = j;
            }
        }
        return maxCandiesIndex;
    }

}
