package arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class two_sum_optimized {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                return(new int[]{i, m.get(target - nums[i])});
            }
            m.put(nums[i], i);
        }

        return(new int[2]);
    }
    
}

/**
 * Notes - 
 * subtracts target from each array element to find the one that would add
 * up to target then searches the map for that key
 * 
 */