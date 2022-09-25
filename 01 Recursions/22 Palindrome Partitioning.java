/********************************************************************************************************

Given a string s, partition s such that every substring of the partition is a palindrome. 
Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.

*******************************************************************************************************/


class Solution {
    
    private boolean isPalindrome(String str,int left,int right){
        
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        
        return true;
        
    }
    
    
    private void partitionHelper(String s,int index,ArrayList<String>list,List<List<String>> ans){
        
        if(s.length() == index){
            ans.add(new ArrayList(list));
        }
        
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                
                list.add(s.substring(index,i+1));
                partitionHelper(s,i+1,list,ans);
                list.remove(list.size()-1);
            }
        }
        
        
        
        
    }
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<List<String>>();
        ArrayList<String>list = new ArrayList<String>();
        partitionHelper(s,0,list,ans);
        
        
        return ans;
        
    }
}


// Problem Link - https://leetcode.com/problems/palindrome-partitioning/
// Video Link - https://www.youtube.com/watch?v=WBgsABoClE0&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=20



