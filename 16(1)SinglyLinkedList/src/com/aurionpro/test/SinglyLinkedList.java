package com.aurionpro.test;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;

	}

	public void deleteEnd() {
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

			} else
				head = tail = null;
		}
	}
	
	public void searchNode(int data) {
		Node current = head;
		int i = 0;
		boolean isThere = false;
		
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			while(current != null) {
				if(current.data == data) {
					isThere = true;
					break;
				}
				i++;
				current= current.next;
			}
		}
		if(isThere) {
			System.out.println("Element at position "+i);
		}
		else System.out.println("No such element ");
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("No data in list ");
			return;
		}
		System.out.println("Nodes of list ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SinglyLinkedList sL = new SinglyLinkedList();
		sL.addNode(1);
		sL.addNode(2);
		sL.addNode(3);
		sL.addNode(4);
		sL.display();
		sL.deleteEnd();
		sL.display();
		sL.searchNode(3);

	}

}
