//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends





class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        char result=' ';

        if(line.length() == 1)
        {
              result = line.charAt(0);       
        }
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for(int i=0;i<line.length();i++)
        {
            char ch = line.charAt(i);
            int count = hm.getOrDefault(ch, 0);
            hm.put(ch, count + 1);
        }
         char maxChar = ' ';
        int maxFrequency = 0;
        for (HashMap.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
         
    }
    
}