import java.io.*;
import java.util.*;

public class div31 {
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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum=0;
			if (n==1) {
				System.out.println(b);

			}else if(n!=1){
				for (int i=1;i<=n ;i++ ) {
					if (i%2!=0) {
						sum+=b;
					}else{
						sum+=a;
					}
				}
			
			System.out.println(sum);
		}
	 }
	}


}
