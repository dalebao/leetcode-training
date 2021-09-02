package No1217MinCostToMoveChips;

public class MinCostToMoveChipsSolution {

    public int minCostToMoveChips(int[] position) {
        int[] m = new int[2];
        // 数组中存放的是位置
        for (int i = 0; i < position.length; i++) {
            m[position[i] & 1]++;
        }

        return Math.min(m[0], m[1]);
    }

    public static void main(String[] args) {
        System.out.println(3 & 1);
    }
}
