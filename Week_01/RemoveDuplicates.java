package com.jksj.algorithm21;
/**
 * 删除排序数组中的重复项
 * @author shizhoulu
 */
public class RemoveDuplicates {

	/**
	 * 暴力求解 时间复杂度 O(n^2) 空间复杂度 O(1)
	 * 
	 * @param nums
	 * @return 数组新长度
	 */
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int length = nums.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (nums[i] == nums[j]) {
					while (j + 1 < length) {
						nums[j] = nums[j + 1];
						j++;
					}
					length -= 1;
					i -= 1;
					break;
				}
			}
		}
		return length;
	}

	/**
	 * 双指针法
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates1(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int i = 0;

		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				if (i != j) {
					nums[i] = nums[j];
				}

			}
		}

		return i + 1;
	}
}
