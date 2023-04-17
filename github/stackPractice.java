import java.io.*;
import java.util.*;

public class stackPractice {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		st.push(40);
		System.out.println(st);
		System.out.println(st.peek());
		st.peek();
		st.pop();
		System.out.println(st);
		System.out.println(st.pop());
	}
}
