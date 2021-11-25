package NC8FindPath;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindPathSolution {
    // 未完全通过测试用例
    public ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {
        LinkedList<Integer> trace = new LinkedList<>();
        dfs(root, expectNumber, trace);
        return res;
    }

    void dfs(TreeNode root, int target, LinkedList<Integer> trace) {

        if (root == null){
            return;
        }

        if (target < 0) {
            return;
        }

        trace.addLast(root.val);
        int t = target - root.val;
        if (t == 0){
            res.add(new ArrayList<>(trace));
        }
        if (root.left != null) {
            dfs(root.left, t, trace);
        }

        if (root.right != null) {
            dfs(root.right, t, trace);
        }
        trace.removeLast();


    }


}
