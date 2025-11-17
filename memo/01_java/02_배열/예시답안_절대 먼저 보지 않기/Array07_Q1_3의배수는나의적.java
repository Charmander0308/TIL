import java.util.Arrays;

public class Array07_Q1_3의배수는나의적 {

	public static void main(String[] args) {

	    int[][] grid = {
	                      {2, 3, 1, 4, 7},
	                      {8, 13, 3, 33, 1},
	                      {7, 4, 5, 80, 12},
	                      {17, 9, 11, 5, 4},
	                      {4, 5, 91, 27, 7}
	    };
	    int count = 0;
	    int sum = 0;
	    for(int [] row : grid) {
	    	for(int i = 0 ; i<row.length; i++) {
	    		if(row[i] %3 == 0) {
	    			row[i] = 0;
	    		}
	    	}
	    	System.out.println(Arrays.toString(row));
	    }
	}

}
