//UsingRecursion
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         ArrayList<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }
    public void postOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
        
    }
}
//We first recursively visit the left child and go on left till we find a node pointing to NULL.
//Then we return to its parent.
//Then we recursively visit the right child.
//After we have returned from the right child as well, only then will we print the current node value.
