import java.io.*;
import java.util.*;

public class OddRepeat {
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
			int k = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int total=0, i=1, count=0;
			while(count<n){
				total+=i;
				i+=2;
				count+=1;
			}
			System.out.println((s-total)/(k-1));
		}
	}
}
