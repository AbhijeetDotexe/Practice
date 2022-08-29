import java.io.*;
import java.util.*;

public class HowManyMaximum {
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
			String str = br.readLine();
			if(str.charAt(0)=='1'){
				count++;
			}
			if (str.charAt(n-2)=='0') {
				count++;
			}
			for (int i=0;i<str.length()-1 ;i++ ) {
				if (str.charAt(i)=='0' && str.charAt(i+1)=='1') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
