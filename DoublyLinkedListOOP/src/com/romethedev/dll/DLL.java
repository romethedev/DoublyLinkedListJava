package com.romethedev.dll;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	//the push method will add a new node to the end of the list
	public void push(Node newNode) {
		// if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		
		//first find the lastNode in the list
		//then, set the lastNode's next to be the newNode;
		//then, we have to set the previous of the lastNode to the lastNode that we found previously.
		//finally, set the list's tail to be the node that we have added
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	public void printValuesForward() {
		//find the first node, aka head
		Node current = this.head;
		
		//while the current node exists....
		while(current != null) {
			//print it's value
			System.out.println(current.value);
			//and move on to its next node
			current = current.next;
		}
	}
	
	//This method prints the values of the nodes from the tail to the head.
	public void printValuesBackward() {
		//find the last node, aka tail
		Node current = this.tail;
		
		//while the current node exists....
		while(current != null) {
			System.out.println(current.value);
			current = current.previous; // decrement backwards
		}
	}
	
	//This method removes the last node of our DLL and returns it.
	public Node pop() {
    	Node lastNode = this.tail;
    	lastNode.previous.next = null;
    	this.tail = lastNode.previous;
    	lastNode.previous = null;
    	return lastNode;
    }
	
	//This method returns a boolean whether the value in the argument is in the list or not. Return true if the value exists, else, return false
	public boolean contains(Integer value) {
		if(this.head == null) {
			System.out.println("no nodes!");
		}
		Node current = this.head;
		while (current != null) {
			if (current.value == value) {
				System.out.println("Found value");
				return true;
			}
			current = current.next;
			
		}
		System.out.println("Value not found");
		return false;
	}
	
	//Returns the number of nodes in the list.
	public int size() {
		if (this.head == null) {
			System.out.println("no nodes!");
		}
		Node runner = this.head;
		int count = 0;
		while (runner != null) {
			count++;
			runner = runner.next;
		}
		System.out.println(count);
		return count;
	}
}
