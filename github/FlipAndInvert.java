import java.io.*;
import java.util.*;

public class FlipAndInvert {
	public static void main(String[] args) {
		
		int image[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		// System.out.println(Arrays.toString(flipAndInvertImage(image)));
		int[][] result = flipAndInvertImage(image);
		for(int i=0;i<result.length;i++){
			for(int j=0; j<image[i].length;j++){
				System.out.print(result[i][j]+",");
			}
			System.out.println();
		}
	}

	public static int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;
        int m = image[0].length;
        for (int i=0;i<n ;i++ ) {
        	int start = 0;
        	int end = m-1;

        	while(start<=end){
        		int temp = image[i][start];
        		image[i][start] = image[i][end];
        		image[i][end] = temp;

        		start+=1;
        		end-=1;
        	}
        }

        for (int i=0;i<n ;i++ ) {
        	for (int j=0;j<image[i].length ;j++ ) {
        		if (image[i][j]==0) {
        			image[i][j]=1;
        		}else {
        			image[i][j] = 0;
        		}
        	}
        }
        return image;
    }
}