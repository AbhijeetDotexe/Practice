import java.io.*;
import java.util.*;

public class DuplicateBracket {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> st = new Stack<Character>();
		for (int i=0;i<str.length();i++ ) {
			char ch = str.charAt(i);
			if (ch==')') {
				if (st.peek()=='(') {
					System.out.println(true);
					return;
				}else {
					while(st.peek()!='('){
						st.pop();
					}
					st.pop();
				}
			}else {
				st.push(ch);
			}
		}
		System.out.println(false);
	}
}
