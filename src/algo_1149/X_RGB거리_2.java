package algo_1149;

import java.util.Scanner;

public class X_RGB°Å¸®_2 {

	static int n;
	static int table[][] = new int[1001][4];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			table[i][1] = sc.nextInt();
			table[i][2] = sc.nextInt();
			table[i][3] = sc.nextInt();
		}

		int result = 0;
		int sum = 0;

		for (int startColor = 1; startColor <= 3; startColor++) {
			boolean flag = false;
			int currentColor = 0;
			sum = 0;

			currentColor = startColor;

			for (int idx = 1; idx <= n; idx++) {
				int min = 0;
				int tmpColor = 0;

				for (int color = 1; color <= 3; color++) {
					if (currentColor == color && flag) {
						continue;
					}

					if (!flag) {
						color = currentColor;
						min = table[idx][color];
						tmpColor = color;
						flag = true;
						break;
					}

					int new_min = table[idx][color];

					if (min == 0) {
						min = new_min;
						tmpColor = color;
					} else if (min > new_min) {
						min = new_min;
						tmpColor = color;
					}
				}

				currentColor = tmpColor;
				sum += min;
				// System.out.println(sum);
			}
			if (result == 0 || result > sum) {
				result = sum;

			}

		}
		System.out.println(result);
	}
}
