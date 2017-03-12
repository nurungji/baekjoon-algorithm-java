package algo_11729;

import java.util.Scanner;

public class 하노이탑이동순서_1 {

	static int n;
	static int stack1[] = new int[20];
	static int stack2[] = new int[20];
	static int stack3[] = new int[20];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = n; i > 0; i++) {
			stack1[i] = i;
		}

		while (true) {
			if (stack3.length == 20)
				break;
			
//			getTop(stack1)
//			stack2
//			stack3
			
		}

	}

	public static int getTop(int arr[]) {
		int i = 0;
		while(true) {
			if(arr[i] < arr[i-1])
				break;
			i++;
		}
		return arr[i];
	}

	public class Position {
		protected int from;
		protected int to;
	}

}
