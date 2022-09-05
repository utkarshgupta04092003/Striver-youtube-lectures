/****************************************************************************************

You have given a value n, you have to print "TakeUForward" n times.

Input : 5
TakeuForward
TakeuForward
TakeuForward
TakeuForward
TakeuForward

*****************************************************************************************/


import java.util.Scanner;
public class Main
{
    
    private static void printNTimes(int n){
        if(n < 1)
            return;
            
        System.out.println("TakeUForward");
        printNTimes(n-1);
    }
	public static void main(String[] args) {

        Scanner s = new  Scanner(System.in);
		
		int n = s.nextInt();
		printNTimes(n);
		
	}
}

