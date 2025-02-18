//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        int temp[] = new int[2];
         
        int count=0;
       HashMap<Integer,Integer> hm  = new LinkedHashMap<>();
       for(int i=0;i<Arr.length;i++)
       {
           int element = Arr[i];
           int freq = hm.getOrDefault(element,0);
           hm.put(element,freq+1);
       }
       for(Map.Entry<Integer,Integer> entry : hm.entrySet())
       {
           if(entry.getValue() % 2 != 0)
           {
              temp[count] = entry.getKey();
              count++;
               
           }
           if (count == 2) 
           {
                    break;
           }
       }
     Arrays.sort(temp);
       int ans[] = new int[2];
        ans[0] = temp[1];
        ans[1] = temp[0];
     
     return ans;
    }
}