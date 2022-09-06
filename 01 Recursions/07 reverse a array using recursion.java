/******************************************************************************
 
 You have given a array of integer of n size, your task is to reverse 
 the elements of array using  recursion.
 
 Input : 1 2 3 4 5
 Output: 5 4 3 2 1
 
*******************************************************************************/
import java.util.*;
public class Main
{
    
    private static void reverse(int arr[],int  start,int end){
        
        if(start >= end)
            return;
            
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        reverse(arr,start+1,end-1);
    }
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        reverse(arr,0,n-1);
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    
	}
}

