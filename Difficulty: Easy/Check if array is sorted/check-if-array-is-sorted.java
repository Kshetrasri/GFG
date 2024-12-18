//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution 
{
    
    int func(int arr[],int i,int result)
    {
        if(i>=arr.length)
        {
            return  result;
        }
       
            if(arr[i] < arr[i-1])
            {
                result=1;
            }
            
         return   func(arr,i+1,result);
        
        
        
    }
    public boolean arraySortedOrNot(int[] arr)
    {
       int result1 =   func(arr,1,0);
        if(result1 == 1)
        {
            return false;
        }
        return true;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] numStrings = line.split(" ");
            int arr[] = new int[numStrings.length];
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(numStrings[i]);
            Solution ob = new Solution();
            boolean ans = ob.arraySortedOrNot(arr);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        scanner.close();
    }
}
// } Driver Code Ends