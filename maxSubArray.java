/**
 * maxSubArray
 */
public class maxSubArray {
    static int maxSubArrayFun(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-1};
        int ans = maxSubArrayFun(nums);
        System.out.println(ans);
    }
}