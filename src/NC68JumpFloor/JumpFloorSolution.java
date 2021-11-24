package NC68JumpFloor;

public class JumpFloorSolution {
    // n = 1 1
    // n = 2 2
    // n = 3 (1,1,1)(1,2)(2,1) 3
    // n = 4 (1,1,1,1)(1,2,1)(2,1,2)(2,2,1)(2,2) 5
    public int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}
