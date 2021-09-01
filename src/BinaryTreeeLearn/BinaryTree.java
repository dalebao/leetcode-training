package BinaryTreeeLearn;

import common.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author baoxulong
 */
public class BinaryTree {

    public Node root;

    public void buildBinaryTree(Node node, int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            if (data > node.val) {
                if (node.right == null) {
                    node.right = new Node(data);
                } else {
                    buildBinaryTree(node.right, data);
                }
            } else {
                if (node.left == null) {
                    node.left = new Node(data);
                } else {
                    buildBinaryTree(node.left, data);
                }
            }
        }
    }

    public List<Integer> prePrint(Node node) {
        if (node != null) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            List<Integer> leftNode = prePrint(node.left);
            if (leftNode != null) {
                list.addAll(leftNode);
            }
            List<Integer> rightNode = prePrint(node.right);
            if (rightNode != null) {
                list.addAll(rightNode);
            }
            return list;
        }
        return null;
    }


    public List<Integer> inPrint(Node node) {
        if (node != null) {
            List<Integer> list = new ArrayList<>();
            List<Integer> leftNode = prePrint(node.left);
            if (leftNode != null) {
                list.addAll(leftNode);
            }
            list.add(node.val);
            List<Integer> rightNode = prePrint(node.right);
            if (rightNode != null) {
                list.addAll(rightNode);
            }
            return list;
        }
        return null;
    }

    public Node rebuildBinary(int[] pre, int[] mid) {
        if (pre == null || mid == null || pre.length == 0 || mid.length == 0) {
            return null;
        }

        if (pre.length != mid.length) {
            return null;
        }

        Node root = new Node(pre[0]);

        for (int i = 0; i < mid.length; i++) {
            if (pre[0] == mid[i]) {
                // 左叶子长度 i
                root.left = rebuildBinary(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(mid, 0, i));
                // 右叶子长度 len - i
                root.right = rebuildBinary(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(mid, i + 1, mid.length));
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{113, 1, 5, 4, 132, 12, 46, 878, 2234};
        BinaryTree binaryTree = new BinaryTree();
        for (int i = 0; i < intArr.length; i++) {
            binaryTree.buildBinaryTree(binaryTree.root, intArr[i]);
        }
        System.out.println(binaryTree);

        for (Integer integer : binaryTree.prePrint(binaryTree.root)) {
            System.out.println(integer);
        }

        for (Integer integer : binaryTree.inPrint(binaryTree.root)) {
            System.out.println(integer);
        }

        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] mid = new int[]{4, 7, 2, 1, 5, 3, 8, 6};


        binaryTree.root = binaryTree.rebuildBinary(pre, mid);
        System.out.println(binaryTree);
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}

