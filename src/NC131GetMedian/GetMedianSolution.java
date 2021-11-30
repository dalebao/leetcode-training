package NC131GetMedian;

public class GetMedianSolution {

    int[] r = new int[1000];
    int n = 0;

    public void Insert(Integer num) {
        if (n == 0) {
            r[0] = num;
            n++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (r[i] > num) {
                if (i == 0) {
                    int tmp = r[0];
                    r[0] = num;
                    r[1] = tmp;
                } else {
                    int j = i - 1;
                    for (int k = n - 1; k > j; k--) {
                        r[k + 1] = r[k];
                    }
                    r[j] = num;
                }
                n++;
                return;
            }
        }
    }

    public Double GetMedian() {
        if (n % 2 == 0) {
            // oushu
            return (double) (r[n / 2] + r[n / 2 - 1]);
        } else {
            return (double) r[n / 2];
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println(111);
        }
    }
}
