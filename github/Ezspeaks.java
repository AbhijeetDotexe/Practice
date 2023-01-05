import java.io.*;
import java.util.*;

public class Ezspeaks {
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
			int count=0;
			String s = br.readLine();
			for (int i=0;i<n ;i++ ) {
				if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					count=0;
				}else {
					count++;
					if (count>3) {
						System.out.println("No");
						break;
					}
				}
			}
			if (count<4) {
				System.out.println("Yes");
			}
		}
	}
}
