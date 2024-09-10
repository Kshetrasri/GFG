//{ Driver Code Starts
import java.util.Arrays;
import java.util.Scanner;
class FindFourElements
{
	
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
			FindFourElements findfour = new FindFourElements();
			int n=sc.nextInt();
			int[] A=new int[n];
			for(int i=0;i<n;i++)
				A[i]=sc.nextInt();
			int X =sc.nextInt();
			
			Compute ob = new Compute();
		    System.out.println(ob.find4Numbers(A, n, X)?1:0);
		}
    }
}


// } Driver Code Ends


class Compute
{
    boolean find4Numbers(int A[], int n, int X) 
    {
        for (int a = 0; a < n - 3; a++) {
        for (int b = a + 1; b < n - 2; b++) {
            for (int c = b + 1; c < n - 1; c++) {
                for (int d = c + 1; d < n; d++) {  // Fix condition here (use `n` instead of `n-3`)
                    if (A[a] + A[b] + A[c] + A[d] == X) {
                        return true;
                    }
                }
            }
        }
    }
    return false;
    }
}