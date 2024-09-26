//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            Node head1 = null, tail1 = null;
            Node head2 = null, tail2 = null;

            String input1 = sc.nextLine();
            String[] elems1 = input1.split(" ");
            for (String elem : elems1) {
                Node newNode = new Node(Integer.parseInt(elem));
                if (head1 == null) {
                    head1 = newNode;
                    tail1 = newNode;
                } else {
                    tail1.next = newNode;
                    tail1 = newNode;
                }
            }

            String input2 = sc.nextLine();
            String[] elems2 = input2.split(" ");
            for (String elem : elems2) {
                Node newNode = new Node(Integer.parseInt(elem));
                if (head2 == null) {
                    head2 = newNode;
                    tail2 = newNode;
                } else {
                    tail2.next = newNode;
                    tail2 = newNode;
                }
            }

            Solution obj = new Solution();
            Node head = obj.sortedMerge(head1, head2);
            printList(head);
        }
        sc.close();
    }
}

// } Driver Code Ends


/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) 
    {
        ArrayList<Integer> al = new ArrayList<>();
       Node temp = head1;
       Node temp1 = head2;
       
       while(temp!=null)
       {
           al.add(temp.data);
           temp = temp.next;
       }
       
        while(temp1!=null)
       {
           al.add(temp1.data);
           temp1 = temp1.next;
       }
       
       Collections.sort(al);
       
     Node   NewHead = null;
       for(int i = al.size()-1;i>=0;i--)
       {
           Node newNode = new Node(al.get(i));
           if(NewHead == null)
           {
               NewHead = newNode;
           }
           else
           {
               newNode.next = NewHead;
               NewHead = newNode; 
           }
       }
       return NewHead;
    }
}
