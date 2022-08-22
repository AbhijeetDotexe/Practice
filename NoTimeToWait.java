import java.io.*;
import java.util.*;

public class NoTimeToWait {
	public static void main(String[] args) throws java.lang.NumberFormatException, IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			// int n = Integer.parseInt(br.readLine());
			// int h = Integer.parseInt(br.readLine());
			// int x = Integer.parseInt(br.readLine());


			int n = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			// Scanner sc = new Scanner(System.in);
			String nums = br.readLine();
			String[] strs = nums.trim().split("\\s+");
			int[] arr = new int[n];
			for (int i=0;i<n ;i++ ) {
				BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer s = new StringTokenizer(b.readLine()," ");
			
				// arr[i] = Integer.parseInt(st.nextToken());
				arr[i] = Integer.parseInt(strs[i]);
			}

			for (int k=0;k<n ;k++ ) {
				if (h<arr[k]+x) {
					System.out.println("YES");
					return;
				}
			}
			System.out.println("NO");
		}
	}

