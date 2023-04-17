import java.io.*;
import java.util.*;

public class AdjacentSum {
    public static void main(String[] args) throws IOException{
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            int z = a[n-1] + a[n-2];
            boolean possible = true;
            for (int i = 0; i < n-1; i++) {
                if (a[i] + a[i+1] >= z) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
