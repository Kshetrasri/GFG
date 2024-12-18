//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int key = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            int ar[] = ob.findIndex(nums, key);
            System.out.println(ar[0] + " " + ar[1]);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    static int func1(int arr[],int i,int first,int key)
    {
        if(i>arr.length-1)
        {
            return first;
        }
        if(arr[i] == key && first == -1)
        {
            first = i;
            
        }
       
        return func1(arr,i+1,first,key);
    }
    
       static int func2(int arr[],int i,int last,int key)
    {
        if(i<0)
        {
            return last;
        }
        if(arr[i] == key && last == -1)
        {
            last = i;
           
        }
         
        return func2(arr,i-1,last,key);
    }
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) 
    {
       int f = func1(arr,0,-1,key);
       int l = func2(arr,arr.length-1,-1,key);
          return new int[] { f, l };
    }
}