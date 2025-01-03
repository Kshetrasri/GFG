//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    // Function to add two numbers represented by linked list.
  
  static Node reverseNum1(Node head)
  {
      Node prevNode = null;
      Node currNode = head;
      Node nextNode;
      
      while(currNode!=null)
      {
          nextNode = currNode.next;
          currNode.next = prevNode;
          prevNode = currNode;
          currNode = nextNode;
      }
      return prevNode;
  }
 
    static Node addTwoLists(Node num1, Node num2) 
    {
        
        Node temp=reverseNum1(num1);
        Node temp1 = reverseNum1(num2);
        
        int carry = 0;
        Node new_head = new Node(0);
        Node curr = new_head;
        while (temp != null || temp1 != null || carry != 0)
        {
        int tempData = (temp != null) ? temp.data : 0;
        int temp1Data = (temp1 != null) ? temp1.data : 0;

        int result = carry + tempData + temp1Data;
        carry = result / 10;
        curr.next = new Node(result % 10);

        if (temp != null) temp = temp.next;
        if (temp1 != null) temp1 = temp1.next;
        curr = curr.next;
    }
         return reverseNum1(new_head.next);
        // code here
        // return head of sum list
    }
}

//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends