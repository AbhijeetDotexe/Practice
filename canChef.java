import java.io.*;
import java.util.*;

public class canChef {
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
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int a = 15*x;
			int b = 2*y;
			if (a>b) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}