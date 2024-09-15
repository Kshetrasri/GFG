//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.removeConsonants(s));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'||
            ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' )
            {
                str = str+ch;
            }
           
        }
         if(str.length()>0)
         {
             return str;
         }
         return "No Vowel";
    }
    
    
}
