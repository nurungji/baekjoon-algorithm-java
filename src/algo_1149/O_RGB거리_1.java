package algo_1149;

import java.util.Scanner;

public class RGB°Å¸® {

	static int n;
	static int arr[][] = new int[1001][4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
			arr[i][3] = sc.nextInt();
		}

		int result = algo(1, 1);

		System.out.println(result);		
	}

	private static int algo(int idx, int cur_color) {
				
		for(int i = 1; i <= 3; i++) {
			if(idx == n) {
				
				return ;
			}
			if(i == cur_color)
				continue;
			
			
			return algo()
		}
	}
}
