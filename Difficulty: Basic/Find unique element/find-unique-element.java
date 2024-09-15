//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public int findUnique(int k, int[] arr) 
    {
        int ans=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int ele = arr[i];
            int freq = hm.getOrDefault(ele,0);
            hm.put(ele,freq+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
       {
           if(entry.getValue() == 1)
           {
               ans= entry.getKey();
           }
       }
       return ans;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(scanner.nextLine().trim());
            String[] inputLine = scanner.nextLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                arr[j] = Integer.parseInt(inputLine[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.findUnique(k, arr));
        }

        scanner.close();
    }
}

// } Driver Code Ends