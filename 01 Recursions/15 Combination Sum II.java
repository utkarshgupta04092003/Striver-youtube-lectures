/*******************************************************************************************

Given a collection of candidate numbers (candidates) and a target number (target),
find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
*********************************************************************************************/



class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
          
        List<List<Integer>> ans = new ArrayList<>();
        
        combinationSumHelper(0,candidates,target,new ArrayList<>(),ans);
        return new ArrayList<>(ans);
        
    }
    
    
    private void combinationSumHelper(int index,int candidates[],int target,ArrayList<Integer> currSum,List<List<Integer>> ans){
        
        
     
       
        if(target == 0){
            ans.add(new ArrayList<>(currSum));
            return;
        }
        
        
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1])
                continue;
            if(candidates[i] > target)
                break;
            
            currSum.add(candidates[i]);
            combinationSumHelper(i+1,candidates,target-candidates[i],currSum,ans);
            currSum.remove(currSum.size()-1);
        }
        
        
    }
    
    
}




// Problem Link - https://leetcode.com/problems/combination-sum-ii/
// video link - https://www.youtube.com/watch?v=G1fRTGRxXU8&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=10
// solution on striver website link - https://takeuforward.org/data-structure/combination-sum-ii-find-all-unique-combinations/
