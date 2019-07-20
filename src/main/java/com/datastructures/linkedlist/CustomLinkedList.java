package com.datastructures.linkedlist;

public class CustomLinkedList {
	
	private Node head;

	public boolean insert(int... datas) {
		
	for(int data:datas) {
		Node linkIt = new Node(data);
		if (head == null) {
			head = linkIt;
		} else {
			Node traverse = head;
			while (traverse.next != null) {
				traverse = traverse.next;
			}
			traverse.next = linkIt;
			
		}
	}
	return true;

	}

	public boolean removeFirst(int data) {
		if (head == null) {
			return false;
		}
		Node traverse = head;
		Node previous = head;
		while (traverse.data != data) {
			previous = traverse;
			traverse = traverse.next;
		}
		previous.next = traverse.next;
		traverse.next = null;
		return true;
	}

	/**
	 * If size is even It will return first middle.
	 * <br>Example: for 1,2,3,4 it will return 2
	 * @return Middle element of List by Iterative method
	 */
	public int getMiddleElement() {
		if (head == null)
			return -1;
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;

	}
	
	
	
	private static Node mid;
	private static int size;
	/**
	 * If size is even It will return first middle.
	 * <br>Example: for 1,2,3,4 it will return 2
	 * @return Middle element of List by Recursive method
	 */
	public int getMiddleElementRecursively(CustomLinkedList list) {
	 if(list.head==null )return -1;
	 if(list.head.next==null )return head.data;
		this.getMiddleElementRecursive(list.head);
	 return mid.data;
	}
	
	
	private void getMiddleElementRecursive(Node traverse) {
		
		if(traverse.next==null) {
			//means you are at the end of linked list
			size++;
			size=size/2;
			return;
			
		}else {
			size++;
			getMiddleElementRecursive(traverse.next);
			
		}
		//now you are at the second last element
		size=size-1;
		if(size==0) {
			mid=traverse;
		}
		
		}
	
	
	public  void reverse() {
		//if size is 0/1 just return
		if(head==null || head.next==null) return;		
		Node prev=null;
		Node current=this.head;
		Node next=null;
		while(current.next!=null) {			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;				
		}
		current.next=prev;
		head=current;
	}
	
	
	public  void reverseRecursively() {
		//if size is 0/1 just return
		if(head==null || head.next==null) return;		
		Node current=this.head;
		Node next=this.head.next;
		reverseRecursive(current,next);
			
	}
	
	private void reverseRecursive(Node current,Node next) {
		if(next.next==null) {
			next.next=current;
			current.next=null;
			this.head=next;
			return;
		}else {
			reverseRecursive(current.next,next.next);
			next.next=current;
			current.next=null;
		}
	}

	public void printList() {
	Node traverse=this.head;
	while(traverse!=null){
		System.out.print(traverse.data+" ");
		traverse=traverse.next;
	}
	}
	
	

	private class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}

	}

}
