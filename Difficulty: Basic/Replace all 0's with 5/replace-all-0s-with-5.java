//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num)
    {
         String numStr = Integer.toString(num);
        char ch[] = numStr.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == '0')
            {
                ch[i] = '5';
            }
        }
         String str = new String(ch);

        // Step 2: Convert string to integer
        int number = Integer.parseInt(str);
        return number;
    }
}