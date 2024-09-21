//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n)
    {
        int rim,result,count=0;
        String str = "";
        while(n>0)
        {
            rim=n%2;
            n=n/2;
            str=rim+str;
            
        }
      //  System.out.println("Thestring is "+str);
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch == '0')
            {
                count++;
                
            }
            if(ch == '1')
            {
                count++;
                break;
            }
            
        }
    return count;
    }
}