import java.io.*;
import java.util.*;

public class BalancedReversal {
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
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			String str = br.readLine();
			char str1[] = str.toCharArray();
			Arrays.sort(str1);
			// System.out.println(String.copyValueOf(str1));
			System.out.println(str1);
		}
	}
}
