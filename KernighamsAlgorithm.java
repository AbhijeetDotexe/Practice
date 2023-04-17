import java.io.*;
import java.util.*;

public class KernighamsAlgorithm {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int counter = 0;
		while(t!=0){
			int rsbm = t & -t;
			t -= rsbm;
			System.out.println(Integer.toBinaryString(t));
			// System.out.println(Integer.toBinaryString(-t));
			counter++;
		}
		System.out.println(counter);
	}
}
