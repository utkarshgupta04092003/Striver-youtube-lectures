/**************************************************************************************

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

**************************************************************************************/


class Solution {
    
    
    private void permutations(int nums[],boolean visited[],ArrayList<Integer> list,List<List<Integer>> ans){
        
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
                
        for(int i=0;i<nums.length;i++){
            
            if(visited[i] == false){
                visited[i] = true;
                list.add(nums[i]);
                permutations(nums,visited,list,ans);

                list.remove(list.size()-1);
                visited[i] = false;

            }
        }
        
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
      
        boolean visited[] = new boolean[nums.length];
        permutations(nums,visited,new ArrayList<Integer>(), ans);
        
        return ans;
    }
}




// Problem link - https://leetcode.com/problems/permutations/
// video link - https://www.youtube.com/watch?v=YK78FU5Ffjw&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12
