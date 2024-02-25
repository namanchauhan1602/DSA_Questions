import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorituyElements2 {
    static List<Integer> majorityElement(int[] nums) {
        int x = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        int count = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            }else{
                count = 1;
            }

            if (count > x && !result.contains(nums[i - 1])) {
                result.add(nums[i - 1]);
            }
        }
        if (count > x && !result.contains(nums[nums.length - 1])) {
            result.add(nums[nums.length - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        majorityElement(nums);
    }
}
