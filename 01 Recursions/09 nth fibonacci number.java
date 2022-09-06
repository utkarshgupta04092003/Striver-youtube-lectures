/******************************************************************************
 
 You have given a number n, you task is to find the nth fibonacci number.
 Note - fibonacci number starts with 1
 
 Input: 5
 Output: 5
 
 
*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static int fibonacci(int n){
        if(n <= 1)
            return 1;
        if(n == 2)
            return 1;
            
        return fibonacci(n-1)+fibonacci(n-2);
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        System.out.println(fibonacci(n));
        
	}
}

