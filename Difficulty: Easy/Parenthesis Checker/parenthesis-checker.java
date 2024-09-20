//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        if(x.length() == 1)
        {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            if(ch == '{')
            {
                stack.push('}');
            }
            else if(ch == '(')
            {
                stack.push(')');
            }
            else if(ch == '[')
            {
                stack.push(']');
            }
           else
           {
                 if (stack.isEmpty()) {
                return false;
            }
            // Check if the current closing bracket matches the expected one
            if (ch != stack.pop()) {
                return false;
            }
           }
        }
       
        
          return stack.isEmpty();
        
    }
}
