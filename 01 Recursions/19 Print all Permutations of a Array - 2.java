/*********************************************************************************************

Given an array nums of distinct integers, return all the possible permutations. 
You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.

*********************************************************************************************/


class Solution {
    
    private void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void permutations(int index,int nums[],List<List<Integer>> ans){
        
        if(index == nums.length){
            List < Integer > list = new ArrayList <>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            ans.add(new ArrayList <>(list));
            return;
        }
                
        
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            
            permutations(index+1,nums,ans);
            swap(i,index,nums);
        }
        
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        permutations(0,nums,ans);
        
        return ans;
    }
}




// Problem link - https://leetcode.com/problems/permutations/
// video link - https://www.youtube.com/watch?v=f2ic2Rsc9pU&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=13
