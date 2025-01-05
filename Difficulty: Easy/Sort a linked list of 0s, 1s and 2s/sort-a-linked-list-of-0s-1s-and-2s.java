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


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) 
    {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        Node temp = head;
        
        
        if(head == null || head.next == null){
            return head;
        }
        while(temp!=null)
        {
            if(temp.data == 0)
            {
                zeros++;
            }
            else if(temp.data == 1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
            temp = temp.next;
        }
        
        temp =  head;
        int length = 0;
        while(length< zeros)
        {
            temp.data = 0;
            length++;
            temp = temp.next;
        }
        length = 0;
        while(length < ones)
        {
            temp.data = 1;
            length++;
            temp = temp.next;
        }
        length = 0;
        
        while(length<twos)
        {
            temp.data = 2;
            length++;
            temp = temp.next;
        }
        
        return head;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends