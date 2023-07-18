class Solution {
    static boolean f=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        f = false;
        check(root,targetSum,0);
        return f;
        
    }
    public void check(TreeNode root,int targetSum,int sum1){
        if(root==null){
            return;
        }
        
         sum1+=root.val;
        if(root.left==null&&root.right==null){
            if(sum1==targetSum){
                f=true;
                return;
            }
        }

        if(root.left!=null){
            check(root.left,targetSum,sum1);
        }
        if(root.right!=null){
            check(root.right,targetSum,sum1);
        }
    }
}

              
    
