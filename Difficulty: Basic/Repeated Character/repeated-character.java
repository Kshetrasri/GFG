//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            int freq = hm.getOrDefault(ch,0);
            hm.put(ch,freq+1);
        }
        char result;
        for(Map.Entry<Character,Integer> map : hm.entrySet())
        {
            if(map.getValue() >1)
            {
                result = map.getKey();
                return result;
            }
        }
        return '#';
    }
}