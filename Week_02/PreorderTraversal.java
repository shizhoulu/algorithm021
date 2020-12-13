package com.jksj.algorithm21;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树前序遍历
 * 
 * @author shizhoulu
 *
 */
public class PreorderTraversal {
	/**
	 * 递归
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal1(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		preorder(root, res);
		return res;
	}
	
	
	
	/**
	 * 迭代
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
	
	
	
	
	

	private void preorder(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		res.add(root.val);
		preorder(root.left, res);
		preorder(root.right, res);
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}

}
