package No1323Maximum69Number;

public class Maximum69NumberSolution {

    public int maximum69Number(int num) {
        int multi = 10;
        int time = 1;
        int sixTime = 0;
        int tmpNum = num;
        while (multi < num) {
            int x = num % multi;
            if (x % 6 == 0) {
                sixTime++;
            }
            num = (num - x);
            multi = multi * multi;
        }
//        num += 3*sixTime*10;
        return num;
    }

    public static void main(String[] args) {
        Maximum69NumberSolution maximum69NumberSolution = new Maximum69NumberSolution();
        maximum69NumberSolution.maximum69Number(9669);
    }
}
