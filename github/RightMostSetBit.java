import java.io.*;
import java.util.*;

public class RightMostSetBit {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int rmsb = t & -t;
		System.out.println(Integer.toBinaryString(rmsb));
	}
}
