package com.jksj.algorithm21;
/**
 * 爬楼梯
 * @author shizhoulu
 *
 */
public class ClimbStair {
	/**
	 * 第一种解法
	 * @param n
	 * @return
	 */
	public int climbStairs1(int n) {
		if (n < 3) {
			return n;
		}
		return climbStairs1(n - 1) + climbStairs1(n - 2);
	}
	/**
	 * 第二种解法
	 * @param n
	 * @return
	 */
	public int climbStairs2(int n) {
		if (n < 3) {
			return n;
		}

		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 2;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[n - 1];
	}
	/**
	 * 第三种解法
	 * @param n
	 * @return
	 */
	public int climbStairs3(int n) {
		if (n < 3) {
			return n;
		}
		int prePre = 1;
		int pre = 2;
		int current = 0;

		for (int i = 3; i <= n; i++) {
			current = prePre + pre;
			prePre = pre;
			pre = current;
		}

		return current;
	}
	/**
	 * 第四种解法
	 * @param n
	 * @return
	 */
	public static int climbStairs4(int n) {
		return Fibonacci(n, 1, 1);
	}

	private static int Fibonacci(int n, int a, int b) {
		if (n <= 1)
			return b;
		return Fibonacci(n - 1, b, a + b);
	}

}
