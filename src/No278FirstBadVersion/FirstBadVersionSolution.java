package No278FirstBadVersion;

public class FirstBadVersionSolution {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right + 1;
    }

    public boolean isBadVersion(int n) {
        return true;
    }
}
