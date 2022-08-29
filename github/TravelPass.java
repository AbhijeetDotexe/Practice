import java.io.*;
import java.util.*;

public class TravelPass {
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
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			String S = br.readLine();
			char[] ch = new char[N];
			for (int i=0;i<S.length() ;i++ ) {
				ch[i] = S.charAt(i);
			}

			int total = 0;
			for (int j=0;j<N ;j++ ) {
				if (ch[j]=='1') {
					total+=B;
				}else {
					total+=A;
				}
			}
			System.out.println(total);
		}
	}
}
