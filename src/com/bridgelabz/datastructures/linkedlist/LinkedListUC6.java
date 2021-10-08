/**********************************************************************************************************************************************************************
 *
 *  Ability to delete the last element in the LinkedList of sequence 56->30->70
 * - Write popLast method
 * - Note there is new tail
 * - Final Sequence: 56->30
 *
 *  @author : Navya Shree
 *
 *********************************************************************************************************************************************************************/
package com.bridgelabz.datastructures.linkedlist;

public class LinkedListUC6 {

	public Node head;
	public Node tail;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// Adding new Node with values
	public void add(int datas) {
		Node newNode = new Node(datas);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// Display the Node with value
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	// Deleting the LastNode with Value
	public void pop() {

		// Checks if the list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				Node current = head;
				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
				System.out.println("After Delete the last element than the LinkedList is : ");
			} else {
				head = tail = null;
			}
		}
	}

	public static void main(String[] args) {
		LinkedListUC6 list = new LinkedListUC6();

		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		list.pop();
		list.display();
	}

}
