public class nonDecraesingSquare {
    public static void main(String[] args) {
        int[] nums = { -10, -3, -1, 2, 4, 5, 7 };
        int[] ans = new int[nums.length];
        int i = 0, j = nums.length - 1, k = 0;
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[k] = nums[i] * nums[i];
                k++;
                i++;
            } else {
                ans[k] = nums[j] * nums[j];
                k++;
                j--;
            }
        }
        i = 0;
        j = ans.length - 1;
        int temp;
        while (i <= j) {
            temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        for (int p : ans) {
            System.out.print(p + " ");
        }
    }
}
