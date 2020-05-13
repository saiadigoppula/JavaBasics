package stack;
import java.util.Stack;

public class stack {


	public static int  sai(String str) {
		 Stack<Character> stack = new Stack<Character>();
		 char c;
		 int count =0;
		   for(int i=0; i < str.length(); i++) {
			   c = str.charAt(i);
			   if(c == '(') {
				   stack.push(c);
			   }
			   else if(c == ')')
				   if(stack.empty()) {
					   return -1;
				   }
				   else if(stack.peek() == '(') {
					   stack.pop();
					   count++;
				   }
				   else
	                    return -1;      
		   }
		return count;
	}
	public static void main(String[] args) {        
	    String str = "(()(()))";
	   
	    System.out.println( sai(str)); 
	}
}
