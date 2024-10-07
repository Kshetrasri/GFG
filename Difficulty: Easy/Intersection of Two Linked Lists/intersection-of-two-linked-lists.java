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

class LinkedList {
    // Static method to print the linked list.
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
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

            // Reading the first linked list from input.
            String[] input1 = sc.nextLine().split(" ");
            for (String s : input1) {
                int tmp = Integer.parseInt(s);
                Node newNode = new Node(tmp);
                if (head1 == null) {
                    head1 = tail1 = newNode;
                } else {
                    tail1.next = newNode;
                    tail1 = tail1.next;
                }
            }

            // Reading the second linked list from input.
            String[] input2 = sc.nextLine().split(" ");
            for (String s : input2) {
                int tmp = Integer.parseInt(s);
                Node newNode = new Node(tmp);
                if (head2 == null) {
                    head2 = tail2 = newNode;
                } else {
                    tail2.next = newNode;
                    tail2 = tail2.next;
                }
            }

            // Finding the intersection of two linked lists.
            Solution obj = new Solution();
            Node result = obj.findIntersection(head1, head2);
            printList(result); // Static call to print the resultant linked list.
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2)
    {
        Node temp = null;
        Node temp1 = null;
        
    ArrayList<Integer> al =  new ArrayList<>();    
       HashSet<Integer> hs = new HashSet<>();
       for(temp = head2;temp!=null;temp = temp.next)
       {
           hs.add(temp.data);
       }
       
        for(temp1 = head1;temp1!=null;temp1 = temp1.next)
       {
           if(hs.contains(temp1.data))
           {
                al.add(temp1.data);
           }
       }
       
        Node new_head= null;
        
        for(int i=al.size()-1;i>=0;i--)
        {
            
        Node new_node = new Node(al.get(i)); 
        if(new_head == null)
        {
            new_head = new_node;
        }
        else
        {
            new_node.next = new_head;
            new_head = new_node;
        }
        }
        return new_head;
    }
}