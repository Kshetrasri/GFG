//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

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
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head);
        }
    }
}

// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution 
{
    Node deleteMid(Node head)
    {
         if (head == null || head.next == null) {
        // If the list is empty or has only one node, return null
        return null;
    }
        int count=0;
        Node temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        
        int mid = count/2;
        
        Node prev = head;
        Node ptr = prev.next;
        int start=0;
        
        while( start<mid-1)
        {
            prev = ptr;
            ptr = ptr.next;
            start++;
        }
        prev.next = ptr.next;
        return head;
        
        
    }
}