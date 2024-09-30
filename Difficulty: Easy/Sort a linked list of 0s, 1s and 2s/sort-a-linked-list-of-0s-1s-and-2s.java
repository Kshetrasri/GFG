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
class Solution 
{
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Node temp = head;
        
        while(temp!=null)
        {
            al.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(al);
        
        Node new_head=  null;
        
        for(int i=al.size()-1;i>=0;i--)
        {
            Node node=  new Node(al.get(i));
            
            if(new_head==null)
            {
                new_head = node;
            }
            else
            {
                node.next = new_head;
                new_head = node;
            }
        }
        return new_head;
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