package NC82MaxInWindows;

import java.util.ArrayList;

public class MaxInWindowsSolution {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0 || size > num.length) {
            return res;
        }
        // 上一个最大值
        int oneMax = 0;
        // 上一个最大值对应的下标
        int oneMaxIndex = -1;

        for (int i = 0; i < num.length-size+1; i++) {
            // 当上一个最大值的下标 不在 当前窗口中
            if (oneMaxIndex <= i - 1) {
                oneMax = num[i];
                // 寻找 size 个 中的最大值
                for (int n = 0; n < size; n++) {
                    if (oneMax < num[i + n]) {
                        oneMax = num[i + n];
                        oneMaxIndex = i + n;
                    }
                }
            }else{
                // 上一个最大值的下标 在当前窗口中，判断窗口最后一个值与上一个最大值的大小
                if (num[i + size - 1] > oneMax) {
                    oneMax = num[i + size - 1];
                    oneMaxIndex = i + size - 1;
                }
            }

            res.add(oneMax);
        }


        return res;
    }
}
