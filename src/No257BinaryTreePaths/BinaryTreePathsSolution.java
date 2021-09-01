package No257BinaryTreePaths;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsSolution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }


        if (root.left != null) {
            List<String> leftPath = binaryTreePaths(root.left);
            for (String s : leftPath) {
                paths.add(root.val + "->" + s);
            }
        }

        if (root.right != null) {
            List<String> rightPath = binaryTreePaths(root.right);

            for (String s : rightPath) {
                paths.add(root.val + "->" + s);
            }
        }

        if (root.right == null && root.left == null) {
            paths.add("" + root.val);
        }

        return paths;
    }

}
