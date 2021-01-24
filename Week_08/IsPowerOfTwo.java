package com.jksj.algorithm21.week08;

/**
 * 2 的幂
 * 
 * @author shizhoulu
 */
public class IsPowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}
}