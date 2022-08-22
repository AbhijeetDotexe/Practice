import java.io.*;
import java.util.*;

public class NButtons1Bulb {
	public static void main(String[] args) throws IOException {
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
			int c = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			String s = br.readLine();
			String s1 = br.readLine();
			for (int j=0;j<s1.length() ;j++ ) {
				if (s.charAt(j)!=s1.charAt(j)) {
					c++;
				}
			}if (c%2 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
