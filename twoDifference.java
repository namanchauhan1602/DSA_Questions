import java.util.Arrays;

public class twoDifference {
    static boolean findPair(int arr[], int size, int n) {
        Arrays.sort(arr);
        int left = 0, right = 1;
        while (right < arr.length) {
            int diff = arr[right] - arr[left];
            
            if (diff == n) {
                return true; // Found a pair with the given difference
            } else if (diff < n) {
                right++; // Move right pointer to increase the difference
            } else {
                left++; // Move left pointer to decrease the difference
                if (left == right) {
                    right++; // Ensure right is always ahead of left
                }
            }
        }
        return false; // No pair found with the given difference
    }

    public static void main(String[] args) {
        int[] arr = { 5, 20, 3, 2, 5, 80 };
        boolean ans = findPair(arr, arr.length, 50);
        System.out.println(ans);
    }
}
