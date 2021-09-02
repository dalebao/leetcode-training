package No860LemonadeChange;

public class LemonadeChangeSolution {


    public boolean lemonadeChange(int[] bills) {
        // 0 表示 5元剩余
        // 1 表示 10元剩余
        // 2 表示 20元剩余
        int[] leftMoney = new int[3];
        for (int bill : bills) {
            if (bill == 5) {
                leftMoney[0]++;
            }
            if (bill == 10) {
                // 找5元
                if (leftMoney[0] > 0) {
                    leftMoney[0]--;
                } else {
                    return false;
                }
                leftMoney[1]++;
            }

            if (bill == 20) {
                // 先尝试用掉十元
                if (leftMoney[1] > 0 && leftMoney[0] > 0) {
                    leftMoney[1]--;
                    leftMoney[0]--;
                } else if (leftMoney[0] > 2) {
                    // 再尝试用掉五元
                    leftMoney[0] -= 3;
                } else {
                    return false;
                }
                leftMoney[2]++;
            }

        }


        return true;
    }

}
