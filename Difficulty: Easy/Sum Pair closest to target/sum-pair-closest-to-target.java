//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) 
    {
        if (arr == null || arr.length < 2) {
            return new ArrayList<>();
        }

        Arrays.sort(arr); // Sort the array for two-pointer technique
        int i = 0, j = arr.length - 1;
        int minDiff = Integer.MAX_VALUE; // Smallest difference between sum and target
        int maxAbsDiff = Integer.MIN_VALUE; // Tie-breaker: Max absolute difference
        List<Integer> result = new ArrayList<>();

        while (i < j) {
            int sum = arr[i] + arr[j];
            int absDiff = Math.abs(sum - target);

            if (absDiff < minDiff) {
                // Found closer sum: Update the pair and reset maxAbsDiff
                minDiff = absDiff;
                maxAbsDiff = Math.abs(arr[i] - arr[j]); // Reset for new closest pair
                result.clear();
                result.add(arr[i]);
                result.add(arr[j]);
            } else if (absDiff == minDiff) {
                // Handle tie-breaking: Prefer pair with maximum absolute difference
                int absDiffBetweenPair = Math.abs(arr[i] - arr[j]);
                if (absDiffBetweenPair > maxAbsDiff) {
                    maxAbsDiff = absDiffBetweenPair;
                    result.clear();
                    result.add(arr[i]);
                    result.add(arr[j]);
                }
            }

            // Move pointers based on comparison with target
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        // Return result pair (already in sorted order due to two-pointer logic)
        return result;
    }
}
