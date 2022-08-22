import java.io.*;
import java.util.*;

public class WaTestCases {
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
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			String line = br.readLine();
			String[] s = line.trim().split("\\s+");
			for (int i=0;i<N ;i++ ) {
				arr[i] = Integer.parseInt(s[i]); 
			}
			String v = br.readLine();
			char[] ch = new char[v.length()];

			for (int j=0;j<v.length();j++ ) {
				ch[j] = v.charAt(j);
			}
			int[] x = new int[N];

			for (int h=0;h<N ;h++ ) {
				if (ch[h]=='0') {
					x[h] = arr[h];
				}
			}
			Arrays.sort(x);
			for (int y=0;y<x.length ;y++ ) {
				if (x[y]!=0) {
					System.out.println(x[y]);
					break;
				}
			}

		}
	}
}
