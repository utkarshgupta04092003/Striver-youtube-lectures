/***********************************************************************************************************************

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations
of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations
for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
1 <= candidates[i] <= 200
All elements of candidates are distinct.
1 <= target <= 500
***********************************************************************************************************************/



class Solution {
    
    private void combinationSumHelper(int index,int candidates[],int target,ArrayList<Integer> currSum,List<List<Integer>> ans){
        
        
        if(index == candidates.length)
            return;
       
        if(target == 0){
            ans.add(new ArrayList<>(currSum));
            return;
        }
        
        if(candidates[index] <= target){
            
            currSum.add(candidates[index]);
            combinationSumHelper(index,candidates,target-candidates[index],currSum,ans);

            currSum.remove(currSum.size()-1);
        }
        combinationSumHelper(index+1,candidates,target,currSum,ans);
        
        
        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        combinationSumHelper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
        
    }
}



// Problem lInk - https://leetcode.com/problems/combination-sum/
// video LInk- https://www.youtube.com/watch?v=OyZFFqQtu98&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=9
