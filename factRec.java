import java.io.*;
import java.util.*;

public class factRec {
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
			long ans = fact(20);
			System.out.println(ans);
		}
	}

	public static long fact(int n){
		if(n==1){
			return 1;
		}

		return n* fact(n-1);
	}
}
