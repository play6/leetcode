package leetcode.com.cool;

public class FindPeakNum {
    public static void main(String[] args) {
        System.out.println("hahaha");
    }

}

/**
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 * or index number 5 where the peak element is 6.
 * You must write an algorithm that runs in O(log n) time.
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= nums[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}