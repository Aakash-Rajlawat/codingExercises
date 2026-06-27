package leetcode;

public class Leetcode {

    static void main(String[] args) {
        Leetcode l1 = new Leetcode();
        int[] nums = {35,4,6,-7,7,23};
        System.out.println(l1.findMaxK(nums));
    }

    ;

    public int findMaxK(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (Math.abs(nums[i]) == Math.abs(nums[j])) {
                    return Math.abs(nums[i]);
                }

            }
        }
        return 1;
    }
}
