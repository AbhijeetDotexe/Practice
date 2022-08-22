import java.io.*;
import java.util.*;

public class Elections {
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

			if (a>50 && a>b && a>c) {
				System.out.println("A");
			}else if (b>50 && b>a && b>c) {
				System.out.println("B");
			}else if (c>50 && c>a && c>b) {
				System.out.println("C");
			}else {
				System.out.println("NOTA");
			}
		}
	}
}
