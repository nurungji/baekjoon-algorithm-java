package algo_1149;

import java.util.Scanner;

public class O_RGB°Å¸®_1 {

	static int n;
	static int arr[][] = new int[1001][4];
	static int sum = 987654321;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
			arr[i][3] = sc.nextInt();
		}

		algo(1, 0, 0);

		System.out.println(sum);		
	}

	private static void algo(int idx, int cur_color, int nowSum) {
		
		int tSum = 0;
		
		if(idx > n) {
			if(nowSum < sum) {
				sum = nowSum;
			}
			return;
		}
		
		for(int i = 1; i <= 3 && idx <= n; i++) {			
			if(i == cur_color)
				continue;
			else {				
				tSum = nowSum + arr[idx][i];
				algo(idx + 1, i, tSum);
				tSum -= arr[idx][i];				
			}
		}		
	}
}
