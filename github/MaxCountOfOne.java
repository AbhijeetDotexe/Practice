import java.io.*;
import java.util.*;

public class MaxCountOfOne {
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
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int zero=0, one=1;
			char x='1',y='0';
			for (int i=1;i<n ;i++ ) {
				if (x!=s.charAt(i-1)) {
					x='1';
					one++;
				}else {
					x='0';
				}
			}

			for (int j=1;j<n ;j++ ) {
				if (y!=s.charAt(j-1)) {
					y='1';
					zero++;
				}else {
					y='0';
				}
			}
			int ans = Math.max(zero,one);
			System.out.println(ans);
		}
	}
}
