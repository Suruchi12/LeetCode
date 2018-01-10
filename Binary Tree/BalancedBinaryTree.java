/**
 * My submissions
 * Difficulty : Easy
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        int height = depth(root);
        if(height == -1)
            return false;
        else
            return true;
        
    }
    
    public int depth(TreeNode root){
        
        if(root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        
        if(left == -1 || right == -1 || Math.abs(left-right) > 1)
            return -1;
        else
            return Math.max(left,right) + 1;
        
    }
    
    
    
}
