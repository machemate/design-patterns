package com.datastructures.linkedlist;

public class TestCustomLinkedList {

	public static void main(String[] args) {
		/**
		 * Get Middle element
		 */
		CustomLinkedList list=new CustomLinkedList();
		list.insert(1,2,3,4,5);
		System.out.println("Middle Elemenet by Iterative Method is: "+list.getMiddleElement());
		System.out.println("Middle Elemenet by Recursive Method is: "+list.getMiddleElementRecursively(list));
		/**
		 * reverse Linked List
		 */
		list.reverseRecursively();
		list.printList();
	}
	
	
	
	
}
