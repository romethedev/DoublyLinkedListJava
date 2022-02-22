package com.romethedev.dll;

public class Node {
	//MEMBER VARIABLES
	public Integer value;
    public Node previous;
    public Node next;
    
    public Node(Integer val) {
        this.value = val;
        this.previous = null;
        this.next = null;
    }
}
