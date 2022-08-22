import java.io.*;
import java.util.*;

public class Marathon {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i=0;i<t ;i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int days = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int td = days*d;
			if (td>42) {
				System.out.println(c);
			}else if (td>=21) {
				System.out.println(b);
			}else if (td>=10) {
				System.out.println(a);
			}else {
				System.out.println(0);
			}
		}
	}
}
