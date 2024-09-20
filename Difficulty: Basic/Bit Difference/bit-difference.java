//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b)
    {
        String num1 ="";
        String num2 ="";
        int flip=0;
        
        while(a!=0)
        {
            int rim = a % 2;
           num1 = rim + num1;
            a = a/2;
        }
       
        while(b!=0)
        {
            int rim = b % 2;
           num2 = rim + num2;
            b = b/2;
        }
       
          while (num1.length() < num2.length()) {
        num1 = "0" + num1;  // Pad num1 with leading zeros
    }

    while (num2.length() < num1.length()) {
        num2 = "0" + num2;  // Pad num2 with leading zeros
    }
      for(int i=0;i<num1.length();i++)
      {
          if(num1.charAt(i)!=num2.charAt(i))
          {
              flip++;
          }
      }
       return flip; 
    }
    
    
}


//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends