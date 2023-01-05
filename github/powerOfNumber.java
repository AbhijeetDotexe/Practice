import java.io.*;
import java.util.*;

public class powerOfNumber {
	final static int c = 20;
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
			int a = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int b=1;
			for (int i=0;i<=n ;i++ ) {
				b=1;
				for (int j=0;j<=i ;j++ ) {
					b*=a;
					System.out.println(c);
				}
				System.out.print(b+" ");
			}

		}
	}
}
