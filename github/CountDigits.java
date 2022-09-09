import java.io.*;
import java.util.*;

public class CountDigits {
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
			int count = 0;
			int x ;
			int a = n;
			while (n>0) {
				x = n%10;
				if (x == 0) {
					n = n/10;
					x = n%10;
				}
				 if (a%x==0) {
					System.out.println(x+" = "+ a%x);
					count++;
				}
				n = n/10;
			}
			System.out.println(count);
		}
	}
}
