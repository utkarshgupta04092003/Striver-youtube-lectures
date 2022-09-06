/******************************************************************************
 
 you have given a number n, your task is to print the sum of n 
 natural numbers.
 Input ; 5
 Output: 15
 
 Input : 10
output : 55
*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static void print(int sum,int n){
        if(n < 1){
            System.out.println(sum);
            return;
            
        }
        print(sum+n,n-1);
       
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(0,n);
    
	}
}

