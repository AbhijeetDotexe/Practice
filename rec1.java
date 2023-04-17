import java.io.*;
import java.util.*;

public class rec1 {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			printNum(20);
		}
	}

	public static void printNum(int n){
		if(n==1){
			System.out.println(1);
			return;
		}
		printNum(n-1);
		System.out.println(n);
		// printNum(n-1);
	}
}
