package No9;

public class No9 {

    public static int frogJump(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return 2 * result;
    }


    public static int JumpFloor(int n) {
        if (n < 3) {
            return n;
        }
        int result = 0;
        int preOne = 2;
        int preTwo = 1;
        for (int i = 3; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
