/******************************************************************************
 
 You have given a number n, your task is to print 1 to n using  recursion
 linearly by using  backtracking, tha means we 
 are not allowed to use recursion with -1

Input : 5
Output : 5 4 3 2 1

*******************************************************************************/

import java.util.*;
public class Main
{
    
    private static void printNto1(int i,int n){
        if(i > n)
            return;
            
        printNto1(i+1,n);
        System.out.println(i);
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        printNto1(1,n);
    
    
	}
}




