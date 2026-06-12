//gfg link :https://www.geeksforgeeks.org/problems/check-if-there-exists-a-subsequence-with-sum-k/1

// Check if there exists a subsequence with sum K
// Difficulty: MediumAccuracy: 40.26%Submissions: 31K+Points: 4Average Time: 30m
// Given an array arr and target sum k, check whether there exists a subsequence such that the sum of all elements in the subsequence equals the given target sum(k).


// Example:

// Input:  arr = [10,1,2,7,6,1,5], k = 8.
// Output:  Yes
// Explanation:  Subsequences like [2, 6], [1, 7] sum upto 8

// Input:  arr = [2,3,5,7,9], k = 100. 
// Output:  No
// Explanation:  No subsequence can sum upto 100
// Your Task:
// You don't need to read or print anything. Your task is to complete the boolean function checkSubsequenceSum() which takes N, arr and K as input parameter and returns true/false based on the whether any subsequence with sum K could be found.


// Expected Time Complexity: O(N * K).
// Expected Auxiliary Space: O(N * K).


// Constraints:
// 1 <= arr.length <= 2000.
// 1 <= arr[i] <= 1000.
// 1 <= target <= 2000.

//1st Approach :
//i have been supposed it as a suarray then i have implememnted the logic as below.

// class Solution {
//     public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
//         // code here
//         //here i am checking for contigous but subsequence need not to be contigous
//         for(int i=0;i<N;i++){
//             int sum=arr[i];
//             for(int j=i+1;j<N;j++){
//                 sum+=arr[j];
//                 if(sum==K){
//                     return true;
//                 }
//             }
//         }
        
//         return false;
//     }
// }



//but actually subsequence not necessary to be contigous..then

// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        //here i am checking for contigous but subsequence need not to be contigous
        return solve(arr,K,0,0);
        
    }
    
    private static boolean solve(int[] arr, int target , int sum,int i){
        
        if(sum==target )return true; 
        
        if(i>= arr.length || sum > target)return false;
        
    
        return solve(arr,target, sum+ arr[i],i+1) || solve(arr,target, sum,i+1);
        
    
        
    }
}

//here no need memoization becuase i have implemented the break case whenevr sum is going to beyond the tareget
// 
