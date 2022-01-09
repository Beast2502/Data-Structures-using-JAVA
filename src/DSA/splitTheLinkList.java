//package DSA;
//
//public class splitTheLinkList {
//}
//
//import crio.ds.List.ListNode;
//        import java.util.*;
//
///*
//public class ListNode {
//    public int val;
//    public ListNode next;
//    public ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//
//Use new ListNode(data) to create new node
//*/
//class Solution {
//
//    public List<ListNode> linkedListSplit(ListNode head) {
//        ListNode dummyOdd = new ListNode(0);
//        ListNode dummyEven = new ListNode(0);
//
//        ListNode evenNode = dummyEven;
//        ListNode oddNode = dummyOdd;
//
//        while(head !=null){
//            if(head.val %2 == 0){
//                evenNode.next = head;
//                evenNode= evenNode.next;
//            }
//            else{
//                oddNode.next = head;
//                oddNode = oddNode.next;
//            }
//            head = head.next;
//        }
//        evenNode.next =null;
//        oddNode.next=null;
//        return Arrays.asList(dummyOdd.next, dummyEven.next);
//
//    }
//};