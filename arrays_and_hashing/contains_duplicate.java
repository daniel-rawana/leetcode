package arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!h.add(nums[i])) {
                return(true);
            }
        }
        return(false);
    }
}
