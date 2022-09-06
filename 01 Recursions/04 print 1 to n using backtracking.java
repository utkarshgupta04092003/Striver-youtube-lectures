/******************************************************************************
 
 You have given a number n, your task is to print 1 to n using  recursion
 linearly by using  backtracking, tha means we 
 are not allowed to use recursion with +1

Input : 5
Output : 1 2 3 4 5

*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static void print1toN(int i,int n){
        if(i < 1)
            return;
            
        print1toN(i-1,n);
        System.out.println(i);
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        print1toN(n,n);
    
    
	}
}

