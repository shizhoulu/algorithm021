package com.jksj.algorithm21;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * @author shizhoulu
 *
 */
public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		_generate(0, 0, n, "", res);
		return res;
    }

	private void _generate(int left, int right, int n, String s,List<String> res) {
		if(left==n && right == n) {
			res.add(s);
			return;
		}
		
		if(left < n) {
			_generate(left+1,right,n,s+"(",res);
		}
		
		if(left > right) {
			_generate(left,right+1,n,s+")",res);
		}
	}
}
