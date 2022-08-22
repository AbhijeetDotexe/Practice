import java.io.*;
import java.util.*;

public class JoiningDate {
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
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int total ;
			int left ;

			if (x%5==0) {
				total = x/5;
			}else {
				total  = (x/5)+1;
			}

			if(y%5==0){
				left = y/5;
			}else {
				left = (y/5)+1;
			}

			int changes = total - left;
			System.out.println(changes);
		}
	}
}
