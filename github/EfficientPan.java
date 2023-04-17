import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class EfficientPan {
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
			BigInteger n = new BigInteger(br.readLine());
			BigInteger ans = n.mod(BigInteger.valueOf(20));
			System.out.println(ans);
		}
	}
}
