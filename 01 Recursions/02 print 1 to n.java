/***********************************************************************

You have given a number n, you have to print numbers from 1 to n 
linearly.

Input : 5
Output : 1 2 3 4 5
***********************************************************************/

import java.util.Scanner;
public class Main
{
    
    private static void print1toN(int i,int n){
        if(i > n)
            return;
            
        System.out.println(i);
        print1toN(i+1,n);
    }
	public static void main(String[] args) {

        Scanner s = new  Scanner(System.in);
		
		int n = s.nextInt();
		print1toN(1,n);
		
	}
}

