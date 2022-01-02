package DSA;

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

  }
}
