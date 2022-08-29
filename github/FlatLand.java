import java.io.*;
import java.util.*;

public class FlatLand {
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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int i=0;
			while(n>0){
				int s = (int)(Math.sqrt(n));
				// System.out.println(s);
				n = n-(s*s);
				i++;
			}
			System.out.println(i);
		}
	}
}
