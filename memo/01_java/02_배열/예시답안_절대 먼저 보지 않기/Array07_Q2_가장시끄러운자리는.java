

public class Array07_Q2_가장시끄러운자리는 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
        	{2,3,1,4},
        	{8,13,3,33},
        	{7,4,5,80},
        	{17,9,11,5}
        };

        int ans = 0;
        int N = arr.length;
        for(int i = 0 ; i<N; i++) {
        	for(int j = 0; j<N; j++) {
        		int sum = arr[i][j];
        		if(i+1 < N) sum += arr[i+1][j];
        		if(i-1 >= 0) sum += arr[i-1][j];
        		if(j+1 < N) sum += arr[i][j+1];
        		if(j-1 >= 0) sum += arr[i][j-1];
        		
        		if(sum>ans) ans = sum;
        	}
        }
        System.out.println(ans);
    }
}
