package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkListPract {
   //Creating a node
   Node head;
   static class Node{
      int data;
      Node next;
      Node(int d){
         data = d;
         next=null;
      }
   }

   //insert the node at the first
   public void insertFirst(int new_data){
      Node new_Node = new Node(new_data);
      new_Node.next=head;
      head=new_Node;
   }

   //insert the node after the give node
   public void insertAfter(Node prev_Node,int new_Data){
      if(prev_Node == null){
         System.out.println("Given node should not be null");
      }

      Node new_Node = new Node(new_Data);
      new_Node.next=prev_Node.next;
      prev_Node.next=new_Node;

   }

   //insert the node at last
   public void insertAtlast(int new_Data){
      if(head == null){
         head = new Node(new_Data);
         return;
      }
      Node new_node = new Node(new_Data);
      Node last =head;
      while(last.next!=null){
         last=last.next;
      }
      last.next = new_node;
      return;
   }

   //Search in the link list
    public boolean searchData(int findData){
       Node n = head;
       while(n!=null){
           if(n.data==findData){
               return true;
           }
           n=n.next;
       }
       return false;
    }

    //delete the node

   public void deleteNode(int delData)
    {
        // Store head node
        Node n = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (n != null && n.data == delData) {
            head = n.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (n != null && n.data != delData) {
            prev = n;
            n = n.next;
        }

        // If key was not present in linked list
        if (n == null)
            return;

        // Unlink the node from linked list
        prev.next = n.next;
    }

    public void printList(){
      Node n = head;
      while(n!=null){
         System.out.print(n.data+" ");
         n=n.next;
      }
   }
  public static void main(String [] args){
      LinkListPract linkList = new LinkListPract();
      linkList.head = new Node(1);
      Node first = new Node(2);
      Node second = new Node(3);
      Node third = new Node(4);

      linkList.head.next= first;
      first.next=second;
      second.next=third;

      linkList.printList();

      System.out.println(" ");
      linkList.insertFirst(5);
      linkList.printList();

      System.out.println("");
      linkList.insertAfter(second,550);
      linkList.printList();

      System.out.println("");
      linkList.insertAtlast(600);
      linkList.printList();

      //Searching element in the link list.
      System.out.println("");
      boolean searched = linkList.searchData(300);
      System.out.println(searched);

      //remove the node from linklist
      System.out.println("");
      linkList.deleteNode(550);
      linkList.printList();


  }
}
