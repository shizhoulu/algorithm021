package com.jksj.algorithm21.week09;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 */
public class FirstUniqChar {
	public int firstUniqChar(String s) {
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < s.length(); ++i) {
			if (frequency.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
