/**********************************************************************************************************************************************************************
 *
 *  Ability to delete the first element in the LinkedList of sequence 56->30->70
 *  Write pop method
 *  Note there is new head
 *  Final Sequence: 30->70
 *
 *  @author : Navya Shree
 *
 *********************************************************************************************************************************************************************/

package com.bridgelabz.datastructures.linkedlist;

public class LinkedListUC5 {  
	
	public Node head;
	public Node tail;
	static class Node  {
		int data;
		Node next;
		
		Node(int data)  {
			this.data = data;
			next = null;
		}
	}
	//Adding new Node with values
	public void add(int datas)  {
		Node newNode = new Node(datas);
		if(head == null)  {
			head = newNode;
			tail =newNode;
		}
		else  {
			newNode.next = head;
			head = newNode;
		}
	}
	//Didplay the Node with value
	public void display()  {
		Node current = head;
		if(head == null)  {
			System.out.println("List is Empty");
		}
		while (current != null)  {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	//Deleting the FirstNode with value
	public void pop( ) {
		Node current = head;
		if(current == head)  {
			head = head.next;
			current = head;
			System.out.println("After Delete the first elements than the LinkedList is : ");
		}
	}
	public static void main(String[] args) {
		LinkedListUC5 list = new LinkedListUC5();
		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		list.pop();
		list.display();
	}

}
