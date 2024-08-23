//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3)
   {
       ArrayList<Integer> al = new ArrayList<>();
       HashMap<Integer,Integer> hm = new HashMap<>();
       HashMap<Integer,Integer> hm1 = new HashMap<>();
       for(int i=0;i<arr1.size();i++)
       {
           int element = arr1.get(i);
           int freq = hm.getOrDefault(element,0);
           hm.put(element,freq+1);
       }
       for(int i=0;i<arr2.size();i++)
       {
           int element = arr2.get(i);
           int freq = hm1.getOrDefault(element,0);
           hm1.put(element,freq+1);
       }
       for(int i=0;i<arr3.size();i++)
       {
           int ele = arr3.get(i);
           if(hm.containsKey(ele)   &&  hm1.containsKey(ele) )
           {
               al.add(ele);
                hm.remove(ele);
                hm1.remove(ele);
           }
       }
       return al; 
    }
}