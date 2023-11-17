package arrays_and_hashing;

import java.util.HashMap;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.get(nums[i]) == null) {
                return(true);
            }
            h.put(nums[i], nums[i]);
        }
        return(false);
    }
}
