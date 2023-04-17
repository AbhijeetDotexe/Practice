import java.io.*;
import java.util.*;

public class Pattern1 {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i=1;i<=t;i++ ) {
			for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
