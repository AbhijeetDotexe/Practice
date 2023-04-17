import java.io.*;
import java.util.*;

public class div32 {
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
			String s = br.readLine();
			Set<Character> ans = new HashSet<>();
			for(int i=0;i<n;i++){
				if (i==0) {
				   ans.add(s.charAt(0));	
				}else {
					if (ans.contains(s.charAt(i))) {
						continue;
					}else {
						ans.add(s.charAt(i));
					}
				}
				
			}
		 	for(Character language : ans) {
      		System.out.print(language);
      		// System.out.print("");
    		}
    		System.out.println();
		}
		
	}
}
