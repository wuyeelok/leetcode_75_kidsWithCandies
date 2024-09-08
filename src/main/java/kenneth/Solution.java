package kenneth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            Set<Integer> maxCandiesIndex = getMaxCandiesIndex(candies, extraCandies, i);

            // After looping, check if maxCandiesIndex equals to target index
            if (maxCandiesIndex.contains(i)) {
                checkResult.add(true);
            } else {
                checkResult.add(false);
            }

        }


        return checkResult;
    }

    private static Set<Integer> getMaxCandiesIndex(int[] candies, int extraCandies, int i) {
        Set<Integer> maxCandiesIndexSet = new HashSet<>();

        int maxCandies = 0;
        int maxCandiesIndex;

        for (int j = 0; j < candies.length; j++) {

            int checkingCandies = candies[j];

            if (i == j) {
                // if checking one, add the extra candies
                checkingCandies = checkingCandies + extraCandies;
            }

            if (checkingCandies > maxCandies) {
                maxCandies = checkingCandies;
                maxCandiesIndex = j;

                // remove all set value and add the maxCandiesIndex
                maxCandiesIndexSet = new HashSet<>();
                maxCandiesIndexSet.add(maxCandiesIndex);
            } else if (checkingCandies == maxCandies) {
                // If equal case, also add the index in to Set
                maxCandiesIndex = j;
                maxCandiesIndexSet.add(maxCandiesIndex);
            }
        }
        return maxCandiesIndexSet;
    }

}
