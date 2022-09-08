/******************************************************************************

count the number of subsequence sum to k


Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K 


Sample Input:
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output:
2


Sample Input:
3
5 2 5 
9
Sample Output:
0
*******************************************************************************/
   
import java.util.*;
public class Main {
    
    private static int printSequencesSumToK(int start,int arr[],int k){
        
        if(k < 0)
            return 0;
        if(start == arr.length){
            
            if(k == 0){
                
                return 1;
            }
            
            return 0;
            
        }
        


        int l = printSequencesSumToK(start+1,arr,k-arr[start]);
        
        int r = printSequencesSumToK(start+1,arr,k);
        
        return l+r;
        

    }
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    
	    int n = s.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = s.nextInt();
	    }
	    
	    int k = s.nextInt();
	    
	    System.out.println(printSequencesSumToK(0,arr,k));;
	}
}


// video link - https://www.youtube.com/watch?v=eQCS_v3bw0Q&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=7
