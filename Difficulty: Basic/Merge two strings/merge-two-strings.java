//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        if(S1.length() < S2.length())
        {
            
            int i;
           String newstr="";
           for( i=0;i<S1.length();i++)
        {
            newstr = newstr + S1.charAt(i);
            newstr = newstr + S2.charAt(i);
        }
        
        if(S1.length()> S2.length())
        {
              String substr = S1.substring(i);
              newstr = newstr+ substr;
        }
        else
        {
              String substr1 = S2.substring(i);
              newstr = newstr+ substr1;
        }
           return newstr;
        }
        else
        {
              int i;
           String newstr="";
           for( i=0;i<S2.length();i++)
        {
            newstr = newstr + S1.charAt(i);
            newstr = newstr + S2.charAt(i);
        }
        
        if(S1.length()> S2.length())
        {
              String substr = S1.substring(i);
              newstr = newstr+ substr;
        }
        else
        {
              String substr1 = S2.substring(i);
              newstr = newstr+ substr1;
        }
           return newstr;
        }
        
    }
} 