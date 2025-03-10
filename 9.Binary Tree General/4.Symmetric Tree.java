class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        else if(left == null || right == null){
            return false;
        }

        return left.val == right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}


✅ Explanation (3-4 lines):
(do it in main function)
Pehle root ke left aur right ko compare karega.
(do it in another function)
Base case: Dono null ho to true, ek null ho to false.
Fir left ka left aur right ka right aur left ka right aur right ka left ko compare karega.
Agar sab same mile to tree symmetric hai, warna nahi.
