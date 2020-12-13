package com.jksj.algorithm21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 有效字母的异位词
 * 
 * @author shizhoulu
 *
 */
public class IsAnagram {
	/**
	 * 排序
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);
	}
	
	/**
	 * 哈希表
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> table = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			table.put(ch, table.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			table.put(ch, table.getOrDefault(ch, 0) - 1);
			if (table.get(ch) < 0) {
				return false;
			}
		}
		return true;
	}
}
