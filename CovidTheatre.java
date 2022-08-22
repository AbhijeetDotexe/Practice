import java.io.*;
import java.util.*;

public class CovidTheatre {
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
			int m = Integer.parseInt(st.nextToken());
			int a=0, b=0;
			a = n%2==0 ? n/2:(n/2)+1;
			b = m%2==0 ? m/2:(m/2)+1;

			System.out.println(a*b);

		}
	}
}
