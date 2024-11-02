//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution 
{
    int result=0;
    void func(int arr[],int i)
    {
        if(i>=arr.length)
        {
            return ;
        }
        else
        {
            if(arr[i] < arr[i-1])
            {
                result=1;
            }
            i++;
            func(arr,i);
        }
        
        
    }
    public boolean arraySortedOrNot(int[] arr)
    {
         func(arr,1);
        if(result == 1)
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