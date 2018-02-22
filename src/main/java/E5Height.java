public class E5Height {

    public boolean isHeightBalanced(final TreeNode root) {
        if (getHeight(root) == Integer.MIN_VALUE) return false;
        return true;
    }

    private int getHeight(final TreeNode root) {
        if (root == null) return 0;

        final int left = getHeight(root.getLeft());
        final int right = getHeight(root.getRight());
        final int diff = Math.abs(left - right);

        if (left == Integer.MIN_VALUE
                || right == Integer.MIN_VALUE
                || diff > 1) {
            return Integer.MIN_VALUE;
        }
        return Math.max(left, right) + 1;
    }
}
