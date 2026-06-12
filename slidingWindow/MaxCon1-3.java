class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                System.out.println("  While Loop - left: " + left + ", zeroCount: " + zeroCount + ", nums[left]: " + nums[left]);
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            System.out.println("Right: " + right + ", Left: " + left + ", ZeroCount: " + zeroCount + ", CurrentLen: " + (right - left + 1) + ", MaxLen: " + maxLen);
        }

        return maxLen;
    }
}

public class MaxCon13{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {0, 0, 0, 1, 0, 1, 1, 1, 0};
        int k = 3;
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("K (max zeros allowed): " + k);
        System.out.println("\n--- Dry Run ---");
        
        int result = sol.longestOnes(arr, k);
        
        System.out.println("\n--- Result ---");
        System.out.println("Maximum length of consecutive 1s: " + result);
    }
}