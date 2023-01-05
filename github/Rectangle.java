import java.io.*;
import java.util.*;

public class Rectangle {
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
			int d = Integer.parseInt(st.nextToken());

			if (a==b && c==d) {
				System.out.println("YES");
			}else if(a==c && b==d){
				System.out.println("YES");
			}else if (a==d && b==c) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
