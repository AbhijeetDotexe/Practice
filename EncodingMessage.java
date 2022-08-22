import java.io.*;
import java.util.*;

public class EncodingMessage {
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
		int N = Integer.parseInt(st.nextToken());
		String str = br.readLine();
		char[] chars = str.toCharArray();
		try{
			for(int i=0; i<N; i++){
			if(i%2==0 && i!=N-1){
				char temp = chars[i];
				chars[i] = chars[i+1];
				chars[i+1] = temp;
			}
			char rep= (char) ('a'+('z'- chars[i]));
			chars[i] = rep;
			}
		}
		catch(ArrayIndexOutOfBoundsException ex){}
			     
		System.out.println(new String(chars));
		}
	}
}
