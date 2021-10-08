/**********************************************************************************************************************************************************************
 *
 *  Ability to insert 30 between 56 and 70
 *  Final Sequence: 56->30->70
 *
 *  @author : Navya Shree
 *
 *********************************************************************************************************************************************************************/
package com.bridgelabz.datastructures.linkedlist;

public class LinkedListUC4 {

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
	//Adding new Node with data 
	public void add(int datas)   {
		Node newNode = new Node(datas);
		if(head == null)  {
			head = newNode;
			tail = newNode;
		}
		else  {
			tail.next = newNode;
			tail = newNode;
		}
	}
	//Display the Node with value 
	public void display()  {
		Node current = head;
		if(head == null)  {
			System.out.println(current.data);
			current = current.next;
		}
	}
	//Insert the value between Given position
	public void insert(int c, int possion) {
		Node newNode = new Node(c);
		Node temp = head;
		for (int i=1; i < possion-1; i++)  {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("30 Added sucessfully between 56 and 70\n");
	}
	public static void main(String[] args) {
		LinkedListUC4 list = new LinkedListUC4();
		list.add(56);
		list.add(70);
		list.insert(30,2);
		list.display();
	}

}
