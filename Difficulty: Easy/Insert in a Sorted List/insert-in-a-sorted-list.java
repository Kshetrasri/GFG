//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DeleteNode {
    Node head;

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;

            temp.next = node;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {

            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node copy = head;
            for (int i = 1; i < s.length; i++) {
                Node temp = new Node(Integer.parseInt(s[i]));
                copy.next = temp;
                copy = copy.next;
            }

            int x = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            Node ans = ob.sortedInsert(head, x);

            while (ans != null) {
                System.out.print(ans.data + " ");
                ans = ans.next;
            }
            System.out.println();

            t--;
        }
    }
}
// } Driver Code Ends


/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int x) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(x);
        Node temp = head;
        
        while(temp!=null)
        {
            al.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(al);
       
       Node new_head=null;
       for(int i = al.size()-1;i>=0;i--)
       {
          Node node = new Node(al.get(i));
          if(new_head == null)
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