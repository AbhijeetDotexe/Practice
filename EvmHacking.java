import java.io.*;
import java.util.*;

public class EvmHacking {
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
		  	int p = Integer.parseInt(st.nextToken());
		  	int q = Integer.parseInt(st.nextToken());
		  	int r = Integer.parseInt(st.nextToken());
		     double required=(p+q+r)/2;
		    
		    if(p+b+c>required){
		        System.out.println("Yes");
		    }
		    else if(a+q+c>required){
		        System.out.println("Yes");
		    }
		    else if(a+b+r>required){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }		
		}
	}
}
