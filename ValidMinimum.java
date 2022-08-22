import java.io.*;
import java.util.*;

public class ValidMinimum {
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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int x = Math.min(a,b);
			int y = Math.min(b,c);
			int z = Math.min(a,c);

			if (x==y && x==z) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
