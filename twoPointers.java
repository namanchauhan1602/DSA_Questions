public class twoPointers {
    public static void main(String[] args) {
        int[] nums = {2,6,1,3,9,10,11,14};
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            }
            if (nums[i] % 2 == 0) {
                i++;
            }
            if (nums[j] % 2 == 1) {
                j--;
            }
        }

        for (int k : nums) {
            System.out.print(k + " ");
        }
    }
}
