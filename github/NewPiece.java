import java.io.*;
import java.util.*;

public class NewPiece {
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
			int ab = a+b;
			int cd = c+d;
			if (a==c && b==d) {
				System.out.println(0);
			}else if(((ab%2==0) && (cd%2==0))||((ab%2!=0) && (cd%2!=0))){
				System.out.println(2);
			}else {
				System.out.println(1);
			}
		}
	}
}
