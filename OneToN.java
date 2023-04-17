import java.io.*;
import java.util.*;

public class OneToN {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		PrintToN(20);
	}

	public static void PrintToN(int n){
		if (n==1) {
			System.out.println(1);
			return ;
		}
		PrintToN(n-1);
		System.out.println(n);
		// PrintToN(n-1);
	}
}
