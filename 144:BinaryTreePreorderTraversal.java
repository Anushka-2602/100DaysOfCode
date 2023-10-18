class Solution {
    List<Integer> list = new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }
}

//Declare a list outside method bcoz we are using recursion
// Loop until root becomes null
// Add root val to list
//Recursively Call for left subtree
// Recursively Call for right subtree
//Return List
//Time&Space Complexity: O(n)
