import java.io.*;
import java.util.*;

public class ProgrammingLanguage {
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
			int a1 = Integer.parseInt(st.nextToken());
			int b1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int b2 = Integer.parseInt(st.nextToken());

			if (a == a1 && b == b1) {
				System.out.println(1);
			}else if (a == b1 && b == a1) {
				System.out.println(1);
			}else if (a == a2 && b == b2) {
				System.out.println(2);
			}else if (a == b2 && b == a2) {
				System.out.println(2);
			}else {
				System.out.println(0);
			}
		}
	}
}
