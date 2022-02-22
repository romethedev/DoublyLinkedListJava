package com.romethedev.dll;

public class DLLTest {

	public static void main(String[] args) {
		// INSTANTIATE OUR LIST
		DLL dll = new DLL();
		//CREATE 6 NEW NODES
		Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        
        //PUSH THOSE NODES INTO OUR LIST
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        dll.printValuesForward();
        
        dll.pop();
        
        dll.printValuesBackward();
        
        dll.contains(15);
        dll.contains(50);
        
        dll.size();
	}

}
