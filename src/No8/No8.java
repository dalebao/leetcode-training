package No8;

public class No8 {

    public static int fibonacci(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(22));
    }
}
