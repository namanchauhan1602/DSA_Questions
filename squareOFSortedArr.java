/**
 * squareOFSortedArr
 */
public class squareOFSortedArr {
    public int[] sortedSquares(int[] nums) {
        int[] andArr = new int[nums.length];
        int k = nums.length - 1;
        int i = 0, j = nums.length - 1, leftSqr,rightSqr;
        while (i <= j) {
            leftSqr = nums[i] * nums[i];
            rightSqr = nums[j] * nums[j];                                               
            if (leftSqr > rightSqr) {
                andArr[k] = leftSqr;
                k--;
                i++;
            }else{
                andArr[k] = rightSqr;
                k--;
                j--;
            }
        }
        return andArr;
    }
}                                               