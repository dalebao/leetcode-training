package NC14ZhiPrint;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class ZhiPrintSolution {

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(pRoot);
        queuePrint(stack);
        return res;
    }

    void queuePrint(Stack<TreeNode> stack1) {
        if (stack1.isEmpty()) {
            return;
        }
        ArrayList<Integer> r = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            r.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        res.add(r);
        stackPrint(stack);
    }

    void stackPrint(Stack<TreeNode> stack) {
        if (stack.isEmpty()) {
            return;
        }
        ArrayList<Integer> r = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            r.add(node.val);
            if (node.right != null) {
                stack1.add(node.right);
            }
            if (node.left != null) {
                stack1.add(node.left);
            }
        }
        res.add(r);
        queuePrint(stack1);
    }

}
