/******************************************************************************
 
 you have given a string, your task is to check weather this string is 
 palindrome or not using  recursion.
 
 Input : madam
Output : true


Input : madamm
Output : false
*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static boolean isPalindrome(String str,int start,int end){
        
        if(start >= end)
            return true;
            
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        
        return isPalindrome(str,start+1,end-1);
        
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        
        System.out.println(isPalindrome(str,0,str.length()-1));
	}
}

