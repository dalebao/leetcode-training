package NC81KthNode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthNodeSolution {


    public int KthNode(TreeNode proot, int k) {
        // write code here
        List<Integer> res = helper(proot);
        if (k > res.size() || k == 0) {
            return -1;
        }

        return res.get(res.size() - k);
    }

    List<Integer> helper(TreeNode proot) {
        if (proot == null) {
            return new ArrayList<>();
        }
        List<Integer> res = helper(proot.left);

        res.add(proot.val);

        res.addAll(helper(proot.right));

        return res;
    }

}
