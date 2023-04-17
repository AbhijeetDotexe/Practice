import java.io.*;
import java.util.*;

public class JosephusProblem {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int ans = solution(t);
		System.out.println(ans);
	}

	public static int powerOf2(int n){
		int i=1;
		while(i*2<=n){
			i=i*2;
		}
		return i;
	}

	public static int solution(int n){
		int hp2 = powerOf2(n);
		int l = n - hp2;
		System.out.println(l);
		return 2*l+1;
	}
}
