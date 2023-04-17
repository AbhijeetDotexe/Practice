import java.io.*;
import java.util.*;

public class TripTastic {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            // int a = Integer.parseInt(st.nextToken());
            int[][] rooms = new int[n][m];
            int totalCapacity = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    rooms[i][j] = Integer.parseInt(st.nextToken());
                    totalCapacity += rooms[i][j];
                }
            }
            if (totalCapacity < k + 1) {
                System.out.println("-1");
                continue;
            }
            int maxDist = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int dist = getDistance(0, 0, i, j);
                    int maxCap = getMaxCapacity(rooms, n, m, k, i, j);
                    if (maxCap >= k) {
                        maxDist = Math.max(maxDist, dist);
                    }
                }
            }
            System.out.println(maxDist);
        }
    }

    public static int getMaxCapacity(int[][] rooms, int n, int m, int k, int row, int col) {
        int[][] dists = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dists[i][j] = getDistance(row, col, i, j);
            }
        }
        int[] capacities = new int[100001];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                capacities[rooms[i][j]]++;
            }
        }
        int maxCap = 0;
        for (int cap = 100000; cap > 0; cap--) {
            if (capacities[cap] == 0) {
                continue;
            }
            int count = capacities[cap];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dists[i][j] <= count) {
                        count -= rooms[i][j] / cap;
                        if (count <= 0) {
                            return cap;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int getDistance(int row1, int col1, int row2, int col2) {
        return Math.max(Math.abs(row1 - row2), Math.abs(col1 - col2));
    }
}
