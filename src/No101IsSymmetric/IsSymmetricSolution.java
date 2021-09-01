package No101IsSymmetric;

import util.TreeNode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class IsSymmetricSolution {

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        Queue<Integer> leftNodes = new LinkedList<>();
        Queue<Integer> rightNodes = new LinkedList<>();


        getLeftNodeVal(root.left, leftNodes);
        getRightNodeVal(root.right, rightNodes);

        while (!leftNodes.isEmpty() && !rightNodes.isEmpty()){
            if (leftNodes.poll() != rightNodes.poll()){
                return false;
            }
        }

        return leftNodes.isEmpty() && rightNodes.isEmpty();
    }

    public void getLeftNodeVal(TreeNode tmpNode, Queue<Integer> nodeVals) {
        if (tmpNode != null) {
            getLeftNodeVal(tmpNode.left, nodeVals);
            nodeVals.add(tmpNode.val);
            getRightNodeVal(tmpNode.right, nodeVals);
        } else {
            nodeVals.add(null);
        }
    }

    public void getRightNodeVal(TreeNode tmpNode, Queue<Integer> rightNodeVals) {
        if (tmpNode != null) {
            getLeftNodeVal(tmpNode.right, rightNodeVals);
            rightNodeVals.add(tmpNode.val);
            getRightNodeVal(tmpNode.left, rightNodeVals);
        } else {
            rightNodeVals.add(null);
        }
    }


}
