//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            ArrayList<Integer> ans = new Solution().countDistinct(arr, k);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            t--;
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        int sum =0;
        int start =0;
        HashMap<Integer,Integer> hm=  new HashMap<>();
        for(int i=0;i<k;i++)
        {
            int ele = arr[i];
            int freq = hm.getOrDefault(ele,0);
            hm.put(ele,freq+1);
            
        }
        al.add(hm.size());
        for(int j=k;j<arr.length;j++)
        {
           int remove = arr[start];
           if(hm.get(remove) == 1)
           {
               hm.remove(arr[start]);
           }
           else
           {
               int prevValue = hm.get(remove);
               hm.put(remove,prevValue-1);
              
           }
           
             int ele1 = arr[j];
            int freq1 = hm.getOrDefault(ele1,0);
            hm.put(ele1,freq1+1);
             al.add(hm.size());
            start++;
        }
        return al;
    }
}
