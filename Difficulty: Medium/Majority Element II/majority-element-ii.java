//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public int[] findMajority(int[] nums) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ele = nums[i];
            int freq = hm.getOrDefault(ele, 0);
    
            hm.put(ele, freq + 1);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> map: hm.entrySet())
        {
            if(map.getValue() > nums.length/3)
            {
                al.add(map.getKey());
            }
        }
       
       if(al.size()==0)
       {
            al.add(-1);
            int arr[] = new int [1];
            arr[0] = al.get(0);
            return arr;
       }
     
          int arr[] = new int [al.size()];
          for(int i=0;i<al.size();i++)
           {
              arr[i] = al.get(i);
            }
      
     
        return arr;
    }
}
