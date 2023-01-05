import java.io.*;
import java.util.*;

public class MostWordsFound {
	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int max = mostWordsFound(sentences);
		System.out.println(max);
	}

	public static int mostWordsFound(String[] sentences){

		int max = Integer.MIN_VALUE;
		for (int i=0;i<sentences.length ;i++ ) {
			int temp = sentences[i].split(" ").length;
			max = temp>max ? temp : max;
		}
		return max;
	 }
}