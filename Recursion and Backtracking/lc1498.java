// 1498. Number of Subsequences That Satisfy the Given Sum Condition
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an array of integers nums and an integer target.

// Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.

 

// Example 1:

// Input: nums = [3,5,6,7], target = 9
// Output: 4
// Explanation: There are 4 subsequences that satisfy the condition.
// [3] -> Min value + max value <= target (3 + 3 <= 9)
// [3,5] -> (3 + 5 <= 9)
// [3,5,6] -> (3 + 6 <= 9)
// [3,6] -> (3 + 6 <= 9)
// Example 2:

// Input: nums = [3,3,6,8], target = 10
// Output: 6
// Explanation: There are 6 subsequences that satisfy the condition. (nums can have repeated numbers).
// [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]
// Example 3:

// Input: nums = [2,3,3,4,6,7], target = 12
// Output: 61
// Explanation: There are 63 non-empty subsequences, two of them do not satisfy the condition ([6,7], [7]).
// Number of valid subsequences (63 - 2 = 61).
 

// Constraints:

// 1 <= nums.length <= 105
// 1 <= nums[i] <= 106
// 1 <= target <= 106



//Brute Approach with recursion and backtracking/but it exceeded
//the time limit 

// class Solution {
//     static int cnt = 0;

//     public int numSubseq(int[] nums, int target) {
        
        
//         cnt = 0;

//         Arrays.sort(nums); // makes sure list.get(0) is min and last is max
//         List<Integer> list = new ArrayList<>();

//         solve(nums, target, 0, list); //calll



//         return cnt;
//     }

//     private static void solve(int[] nums, int target, int i, List<Integer> list) {
//         if (i >= nums.length) {

//             if (!list.isEmpty()) {

//                 int min = list.get(0);
//                 int max = list.get(list.size() - 1);

//                 if (min + max <= target) {
//                     cnt++;
//                 }

//             }
//             return;
//         }

//         // Includeee current elem

//         list.add(nums[i]);
//         solve(nums, target, i + 1, list);

//         // Backtrack (exclude)

//         list.remove(list.size() - 1);
//         solve(nums, target, i + 1, list);
//     }
// }


//lets think of another solution with low time complexity and should cover the all the subsequencess one of the approach is seems as 
//2 pointer and binary search..

