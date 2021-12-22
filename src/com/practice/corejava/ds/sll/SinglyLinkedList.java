package com.practice.corejava.ds.sll;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;

        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }

        return length;
    }

    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    public void insertLast(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = node;
            return;
        }

        ListNode current = head;
        if(null != current.next){
            current = current.next;
        }
        current.next = node;
    }

    public boolean find(ListNode head, int searchValue){
        if(head == null){
            return false;
        }

        ListNode current = head;
        while(current != null){
            if(current.data == searchValue){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(11);
        ListNode foutth = new ListNode(8);

        //will connect them to build a chain
        sll.head.next = second;
        second.next = third;
        third.next = foutth;

        /*sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);*/

        sll.display();

        System.out.println();

        System.out.print("Length of singly linked list is : " + sll.length());


        if (sll.find(sll.head, 81)) {
            System.out.println("Found!!");
        } else {
            System.out.println("Not Found");
        }
    }
}
