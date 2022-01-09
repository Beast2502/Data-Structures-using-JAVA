package DSA;

import java.util.Scanner;

public class LinkList {

    // Creating a node
    Node head;
    static class Node{
        int data ;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }

    // Insert the Node at the First
    public void insertFirst(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    //Inert the node After the given previous node
    public void insertAfter(Node prev_node , int new_data){
        if(prev_node == null){
            System.out.println("the give previous node cannot be null");
        }

        //Create a node
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    //Add the node from the last
    public void insertLast(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next=null;
        Node last = head;
        while(last.next!= null){
            last=last.next;
        }
        //Change the next o last node
        last.next= new_node;
        return;
    }

    //Print the link list
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }



    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            LinkList linkList = new LinkList();
            linkList.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node four = new Node(4);
            Node five = new Node(5);

            //link the LinkList
            linkList.head.next = second;
            second.next = third;
            third.next=four;
            four.next=five;

            System.out.print("initial link list ");

            // print the link list
            linkList.printList();

            System.out.println("");
            //Add the node at the First
        System.out.print("Enter the Number to add the First Node");
            int d = sc.nextInt();
            linkList.insertFirst(d);
            linkList.printList();

        System.out.println("");
        //Add the node After the given node
        System.out.print("Enter the Number to add the node after the given node");
        d = sc.nextInt();
            linkList.insertAfter(second, d);
            linkList.printList();

        System.out.println("");

        //Add the node at last
        System.out.print("Enter the Number to add the node at the last");
        d = sc.nextInt();
         linkList.insertLast(d);
         linkList.printList();
    }
}
