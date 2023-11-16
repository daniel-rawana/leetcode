package arrays_and_hashing;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];

        for (int index = 0; index < nums.length - 1; index++) {
            for (int j = index+1; j < nums.length; j++) {
                if (nums[index] + nums[j] == target) {
                    sol = new int[]{index,j};
                    return(sol);
                }
            }
        }

        return(sol);
    }
}
