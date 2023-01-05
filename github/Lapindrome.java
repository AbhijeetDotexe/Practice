import java.io.*;
import java.util.*;

public class Lapindrome {
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
			String s = br.readLine();
			int n = s.length();
			String a,b;
			if (n%2==0) {
				a = s.substring(0,n/2);
				b = s.substring(n/2,n);
			}else {
				a = s.substring(0,n/2);
				b = s.substring((n/2)+1,n);
			}

			char[] c1 = a.toCharArray();
			char[] c2 = b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1,c2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
