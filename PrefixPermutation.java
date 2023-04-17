import java.io.*;
import java.util.*;

public class PrefixPermutation {
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
			if (n%2!=0) {
				System.out.println("-1");
			}else{
				for (int i=1;i<=n ;i+=2 ) {
					System.out.println((i+1)+" "+i+" ");
				}
				System.out.println();
			}
		}
	}
}
