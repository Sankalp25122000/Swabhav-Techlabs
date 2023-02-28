package com.aurionpro.model;

import com.aurionpro.test.SinglyLinkedList;

public class SinglyLinkedListTest {
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
