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
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int i=1,count=0;;
			// StringTokenizer s = new StringTokenizer(br.readLine());
			// int a = Integer.parseInt(s.nextToken());
			// int b = Integer.parseInt(s.nextToken());
			while(n>=0 && k>=0){
				 if((i&1)==1){
				 	n = n-i;
				 	i++;
				 	count=1;
				 }else{
				 	k = k-i;
				 	i++;
				 	count=2;
				 }
			}

			if(count==1){
				System.out.println("Bob");
			}else{
				System.out.println("Limak");
			}
		}
	}
}
