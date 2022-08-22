import java.io.*;
import java.util.*;

public class BearAndCandies {
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
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int l = 0;
			int b = 0;
			int count = 0;
			while(l<=A && b<=B){
				count+=1;
				l+=count;
				count+=1;
				b+=count;
			}
			if(l>A && b>B){
		        System.out.println("BOB");
		    }
		    else if(l>A){
		        System.out.println("BOB");
		    }
		    else{
		        System.out.println("LIMAK");
		    }

		}
	}
}
