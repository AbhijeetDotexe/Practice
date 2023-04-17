import java.io.*;
import java.util.*;

public class MeltGold {
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
			int count = 0;
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int fin = Integer.parseInt(strs[0]);
			int init = Integer.parseInt(strs[1]);
			for (int i=1;i<fin ;i++ ) {
				if(init<fin){
					init +=i;
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
