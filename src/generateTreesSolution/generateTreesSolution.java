package generateTreesSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generateTreesSolution {


    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> nodeList = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
//            nodeList.addAll();
        }


        return nodeList;
    }

    public static TreeNode build(int root, int[] nums) {
        // root = 1 nums [2,3]
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        TreeNode rootNode = null;
        for (int num : nums) {
            TreeNode treeNode = build(num, deleteNum(num, nums));
            if (treeNode.val < root) {
                rootNode = new TreeNode(root, treeNode, null);
            } else {
                rootNode = new TreeNode(root, null, treeNode);
            }
        }

        return null;
    }

    public static int[] deleteNum(int n, int[] nums) {
        int[] res = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < n) {
                res[i] = nums[i];
            } else {
                res[i] = nums[i + 1];
            }
        }
        return res;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
