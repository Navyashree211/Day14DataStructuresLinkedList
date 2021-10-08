package com.bridgelabz.datastructures.linkedlist;

public class CreateLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		CreateLinkedList linkedList = new CreateLinkedList();
		linkedList.head = new Node(56);
		Node Second = new Node(30);
		Node Thired = new Node(70);

		linkedList.head.next = Second;
		Second.next = Thired;
		
		//print the Data with Values
		while (linkedList.head != null)  {
			System.out.println(linkedList.head.data);
			linkedList.head = linkedList.head.next;
		}
	}
}
