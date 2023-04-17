import java.io.*;
import java.util.*;

public class VowelString {
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
			String[] words = {"v","ab","fu","nu"};
			int left=0, right=2;
			int ans = vowelStrings(words,left,right);
			System.out.println(ans);

		}
	}
    public static int vowelStrings(String[] words, int left, int right) {
            int count = 0;
    for (int i = left; i <= right; i++) {
        String word = words[i];
        if (isVowelString(word)) {
            count++;
        }
    }
    return count;
    }
    
    private static boolean isVowelString(String word) {
    char firstChar = word.charAt(0);
    char lastChar = word.charAt(word.length() - 1);
    return isVowel(firstChar) && isVowel(lastChar);
}

private static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
}

