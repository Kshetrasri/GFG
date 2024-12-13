//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }

            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            n = a2.length;
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(a2[i]);
            }

            int ans = new Solution().maxMeetings(a, b);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[])
    {
        int temp[][] = new int[start.length][2];
        for(int i=0;i<start.length;i++)
        {
            temp[i][0] = start[i];
            temp[i][1] = end[i];
        }
        Arrays.sort(temp,(a,b) -> Integer.compare(a[1],b[1]));
        
        int meeting=1;
        int last = temp[0][1];
        for(int i=1;i<start.length;i++)
        {
            if(temp[i][0] > last)
            {
                meeting++;
                last = temp[i][1];
            }
        }
        return meeting;
    }
}
