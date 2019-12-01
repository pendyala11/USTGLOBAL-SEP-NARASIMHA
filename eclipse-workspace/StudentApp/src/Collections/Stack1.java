package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack<Integer> s = new Stack<Integer>();
    s.add(12);
    s.push(13);
    s.push(45);
    System.out.println(" using get method");
   for (int i = 0; i < s.size(); i++) {
	   System.out.println(s.get(i));
}
   System.out.println(" using pop method ");
   for (int i = 0; i < s.size(); i++) {
	   System.out.println(s.pop());
}
	}

}
