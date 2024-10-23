//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}


// } Driver Code Ends
/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n)
    {
        int result=0;
        int length=0;
       
        Node temp=head;
        int result1=0;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        temp= head;
        if( n < length)
        {
            int count=1;
            int traverse = length-n;
            
            while(temp!=null)
            {
                
              
                if(count > traverse)
                {
                     result = result+ temp.data;
                     
                }
                count++;
                temp  = temp.next;
            }
        }
       
        else
        {
           Node temp1 = head;
           while(temp1!=null)
           {
               result = result+ temp1.data;
               temp1 = temp1.next;
           }
        }
        //  System.out.print(result);
        // System.out.println(result1);
        //   System.out.println(length);
        return result;
    }
}

//{ Driver Code Starts.

class LinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int n = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            Solution ob = new Solution();
            System.out.println(ob.sumOfLastN_Nodes(head, n));
        }
    }
}

// } Driver Code Ends