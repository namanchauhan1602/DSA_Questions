import java.util.Arrays;

/**
 * twoSum
 */
public class twoSum {
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == x) {
                return true;
            }
            if (arr[left] + arr[right] > x) {
                right--; 
            }
            if (arr[left] + arr[right] < x) {
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,7};
        boolean ans = hasArrayTwoCandidates(arr, arr.length, 4);
        System.out.println(ans);
    }
}