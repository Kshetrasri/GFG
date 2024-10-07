//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> hs1 = new HashSet<>();
        
        for(int i=0;i<s1.length();i++)
        {
            hs.add(s1.charAt(i));
        }
        
        for(int i=0;i<s2.length();i++)
        {
            hs1.add(s2.charAt(i));
        }
        
        String result ="";
        
        for(int i=0;i<s1.length();i++)
        {
            if(!hs1.contains(s1.charAt(i)))
            {
                result = result+ s1.charAt(i);
            }
        }
        
        for(int i=0;i<s2.length();i++)
        {
            if(!hs.contains(s2.charAt(i)))
            {
                result = result+ s2.charAt(i);
            }
        }
       if(result.length()>0)
       {
           return result;
       }
       return "-1";
    }
    
}
