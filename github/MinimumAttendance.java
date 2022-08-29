import java.io.*;
import java.util.*;

public class MinimumAttendance {
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
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int present = 120-n;
			int absent = 0;
			String s = br.readLine();
			char[] ch = s.toCharArray();
			for (int i=0;i<n ;i++ ) {
				if (ch[i]=='1') {
					present++;
				}else {
					absent++;
				}
			}
			if (absent<=30) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

		}
	}
}
