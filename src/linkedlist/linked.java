package linkedlist;
import java.util.*;

public class linked {
	//static LinkedList<Integer> LNode = new LinkedList<Integer>();
	public static LinkedList reverseList(LinkedList node) {
		 //if(node == null) return;
		System.out.println(node);
		 int size = size(node);
		    if(size == 1) return node;
		    
		return node;
		
	}
	
	public static int size(LinkedList node) {
		LinkedList current = node;
		Iterator itr =  current.iterator();
		
	    int count = 0;
	    while(itr.hasNext()) {
	    	
	    	count ++;
	    	}
	    return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//LinkedList<Integer> object = new LinkedList<Integer>(); 
		LinkedList<Integer> LNode = new LinkedList<Integer>();
		LNode.add(2); 
		LNode.add(3); 
		LNode.addLast(6); 
		LNode.addFirst(1); 
		LNode.add(4); 
		LNode.add(8); 
		LNode.add(9);
		LNode.add(7);
		System.out.println(LNode);
		System.out.println(reverseList(LNode));
	  }


}
