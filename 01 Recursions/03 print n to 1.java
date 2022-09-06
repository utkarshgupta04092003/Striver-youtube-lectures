/******************************************************************************
 
 you have given a number n, your task is to print natural number from n to 1
 using recursion.
 
 Input : 5
 Output : 5 4 3 2 1
 
 
*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static void printNto1(int i,int n){
        if(i < 1)
            return;
            
        System.out.println(i);
        printNto1(i-1,n);
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        printNto1(n,n);
    
    
	}
}

