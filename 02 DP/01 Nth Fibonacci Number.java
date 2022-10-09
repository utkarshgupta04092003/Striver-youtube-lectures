/*************************************************************************************************

Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, 
return the answer modulo 1000000007.

Example 1:

Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number
of fibonacci series.
Example 2:

Input: n = 5
Output: 5
Explanation: 5 is the 5th number
of fibonacci series.

Your Task:  
You dont need to read input or print anything. Complete the function nthFibonacci()
which takes n as input parameter and returns nth fibonacci number.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

**************************************************************************************************/


//Recursive Code - 
class Solution {
    
    static long mod = 1000000007;
    static long nthFibonacci(long n){
        
        if(n == 0 || n == 1){
            return n;
        }
        
        return (nthFibonacci(n-1)+nthFibonacci(n-2))%mod;
        
    }
}
// Time complexity - O(n^2)
// Auxilary space - O(n)



// Memoization code - 
class Solution {
    
    static long mod = 1000000007;
    
    
    static long fib(long dp[],int n){
        
        if(n == 0 || n == 1)
            return n;
            
        if(dp[n] != -1)
            return dp[n];
            
        dp[n] = (fib(dp,n-1)+fib(dp,n-2))%mod;
        
        return dp[n];
    }
    
    
    static long nthFibonacci(long n){
        
        int n1 = (int)n;
        long dp[] = new long[n1+1];
        Arrays.fill(dp,-1);
        
        return fib(dp,n1);
    }
}


// Time complexity - O(n)
// Auxilary space - O(n)





// Tabular code -
class Solution {
    
    static long mod = 1000000007;
   
    static long nthFibonacci(long n){
        
        int n1 = (int)n;
        long dp[] = new long[n1+1];
        Arrays.fill(dp,-1);
        
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=2;i<=n1;i++){
            dp[i] = (dp[i-1]+dp[i-2])%mod;
        }
        return dp[n1];
    }
}

// Time complexity - O(n)
// Auxilary space - O(n)





// Space Optimized code - 
class Solution {
    
    static long mod = 1000000007;
   
    static long nthFibonacci(long n){
        
        
        long prev = 1;
        long prev2 = 0;
        for(int i=2;i<=n;i++){
            
            long curr = (prev+prev2)%mod;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}


// Time complexity - O(n)
// Auxilary space - O(1)




