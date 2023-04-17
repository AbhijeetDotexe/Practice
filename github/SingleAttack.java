import java.io.*;
import java.util.*;

public class SingleAttack {
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
			int h = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int ans = 1;
			if(y>=h){
				System.out.println(1);
			}else{
				h=h-y;
				while(h>0){
					h=h-x;
					ans++;
				}
				System.out.println(ans);
			}
		}
	}
}
