import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class E5HeightTest {

    @Test
    public void heightTest() {
        final E5Height e5Height = new E5Height();
        ArrayList<TreeNode> nodes = generateTreeNodes(6);

        nodes.get(0).setLeft(nodes.get(1));
        nodes.get(0).setRight(nodes.get(2));

        nodes.get(1).setLeft(nodes.get(3));
        nodes.get(1).setRight(nodes.get(4));

        nodes.get(2).setLeft(nodes.get(5));

        Assert.assertTrue(e5Height.isHeightBalanced(nodes.get(0)));
        nodes.get(5).setRight(new TreeNode(6));
        Assert.assertFalse(e5Height.isHeightBalanced(nodes.get(0)));
    }

    private ArrayList<TreeNode> generateTreeNodes(int number) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        for(int i = 0; i<number; i++) {
            TreeNode node = new TreeNode(i);
            nodes.add(i, node);
        }
        return nodes;
    }

    private void inOrderTraverse(TreeNode root) {
        if(root == null) return;
        inOrderTraverse(root.getLeft());
        System.out.println(root.getValue());
        inOrderTraverse(root.getRight());
    }
}
