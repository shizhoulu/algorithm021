package com.jksj.algorithm21;

/**
 * 旋转数组 输入: [1,2,3,4,5,6,7] 和 k = 3 输出: [5,6,7,1,2,3,4]
 * 
 * @author shizhoulu
 *
 */
public class RotateArray {

	/**
	 * 最笨暴力
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
		if(nums == null || nums.length ==0 || k<1) {
			return;
		}
		k %= nums.length;

		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			for (int j = nums.length - 2; j >= 0; j--) {
				nums[j+1] = nums[j];
			}
			nums[0] = temp;
		}

	}

	/**
	 * 使用额外的数组
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate1(int[] nums, int k) {
		if(nums == null || nums.length ==0 || k<1) {
			return;
		}
		k %= nums.length;
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			a[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = a[i];
		}
	}
	
	/**
	 * 使用反转
	 * @param nums
	 * @param k
	 */
	public void rotate2(int[] nums, int k) {
		if(nums == null || nums.length ==0 || k<1) {
			return;
		}
		k %= nums.length;
		reverseArray(nums, 0, nums.length - 1);
		reverseArray(nums, 0, k-1);
		reverseArray(nums, k, nums.length - 1);
		
		
	}
	
	private void reverseArray(int[] arr , int start , int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			++start;
			--end;
		}
	}
	
	

}
