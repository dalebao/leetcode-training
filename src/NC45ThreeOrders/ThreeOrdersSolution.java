package NC45ThreeOrders;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ThreeOrdersSolution {
    public int[][] threeOrders(TreeNode root) {
        // write code here
        List<Integer> list1 = pre(root);
        List<Integer> list2 = mid(root);
        List<Integer> list3 = post(root);
        int[][] r = new int[3][list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            r[0][i] = list1.get(i);
            r[1][i] = list2.get(i);
            r[2][i] = list3.get(i);
        }
        return r;
    }

    List<Integer> pre(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> leftArr = pre(root.left);
        List<Integer> rightArr = pre(root.right);
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        res.addAll(leftArr);
        res.addAll(rightArr);
        return res;
    }

    List<Integer> mid(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> leftArr = mid(root.left);
        List<Integer> rightArr = mid(root.right);
        List<Integer> res = new ArrayList<>();
        res.addAll(leftArr);
        res.add(root.val);
        res.addAll(rightArr);
        return res;
    }

    List<Integer> post(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> leftArr = post(root.left);
        List<Integer> rightArr = post(root.right);
        List<Integer> res = new ArrayList<>();
        res.addAll(leftArr);
        res.addAll(rightArr);
        res.add(root.val);
        return res;
    }
}
