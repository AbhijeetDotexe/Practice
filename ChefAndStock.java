import java.io.*;
import java.util.*;

public class ChefAndStock {
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
			Float S = Float.parseFloat(st.nextToken());
			Float A =  Float.parseFloat(st.nextToken());
			Float B =  Float.parseFloat(st.nextToken());
			Float C =  Float.parseFloat(st.nextToken());
			Float percent = ((C*S)/100);
			Float ans;
			ans = S+percent;
			if (ans>=A && ans<=B) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
