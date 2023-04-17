import java.io.*;
import java.util.*;

public class DivideOrNot {
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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==b){
				System.out.println(-1);
				return ;
			}
			int ans = c/a;
			if(c%a == 0 && c%b!=0){
				ans = c/a;
			}
			else if(c%b==0 && c%a==0){
				ans = ans+1;
			}else if(ans%b!=0){
				ans = ans;
			}
			if(ans<c){
				ans = c/a +1;
			}
			ans = ans*a;
			System.out.println(ans);
		}
	}


}
