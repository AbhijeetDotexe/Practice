import java.io.*;
import java.util.*;

public class ChefAndServes {
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
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int change = (p+q)/k;
			if (change%2==0) {
				System.out.println("CHEF");
			}else {
				System.out.println("COOk");
			}
		}
	}
}
