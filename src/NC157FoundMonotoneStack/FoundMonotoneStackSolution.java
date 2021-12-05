package NC157FoundMonotoneStack;

import java.util.Stack;

public class FoundMonotoneStackSolution {

    public int[][] foundMonotoneStack(int[] nums) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        int[][] res = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                // 当栈里的数据，都比当前值大，则弹出。
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i][0] = -1;
            } else {
                // 栈顶离当前值最近
                res[i][0] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i][1] = -1;
            } else {
                res[i][1] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
