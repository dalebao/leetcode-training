package NC77ReOrderArray;

public class ReOrderArraySolution {

    public int[] reOrderArray(int[] array) {
        // write code here
        int[] jArr = new int[array.length];
        int[] oArr = new int[array.length];
        int j = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                jArr[j] = array[i];
                j++;
            } else {
                oArr[n] = array[i];
                n++;
            }
        }
        for (int i = 0; i < n; i++) {
            jArr[j + i] = oArr[i];
        }
        return jArr;
    }
}
