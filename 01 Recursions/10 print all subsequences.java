/******************************************************************************

Given a string, your task is to print All subsequence of the given string.

Input : "abc"
Output : 
abc
ab
ac
a
bc
b
c


*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static void printSequences(String str,String ans){
        
        int n = str.length();
        if(n == 0){
            System.out.println(ans);
            return;
        }
        
        
        printSequences(str.substring(1),ans+str.charAt(0));
        
        printSequences(str.substring(1),ans);
        
        
        
        
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    String str = s.next();
	    
	    printSequences(str,"");
	}
}


// Referral video - https://www.youtube.com/watch?v=AxNNVECce8c&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=6 
