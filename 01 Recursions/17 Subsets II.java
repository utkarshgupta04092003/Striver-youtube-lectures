/******************************************************************************************

Given an integer array nums that may contain duplicates, return all possible subsets 
(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10

*******************************************************************************************/


class Solution {
    
    
    private void subsetHelper(int index,int nums[],ArrayList<Integer>list,List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(list));
        
        
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i] == nums[i-1])
                continue;
            
             
            list.add(nums[i]);
            subsetHelper(i+1,nums,list,ans);

            list.remove(list.size()-1);
        }
        
       
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subsetHelper(0,nums,new ArrayList<Integer>(),ans);
        
        return ans;
    }
}




// Problem link - https://leetcode.com/problems/subsets-ii/
// video link - https://www.youtube.com/watch?v=RIn3gOkbhQE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12
