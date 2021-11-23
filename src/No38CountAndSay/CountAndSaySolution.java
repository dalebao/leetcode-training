package No38CountAndSay;

public class CountAndSaySolution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String r = countAndSay(n - 1);
        String s = "";
        for (int i = 0; i < r.length();) {
            int j = i + 1;
            for (; j < r.length(); j++) {
                if (r.charAt(i) != r.charAt(j)) {
                    break;
                }
            }
            int count = j - i;
            s = s + count + r.charAt(i);
            i = j;
        }
        return s;
    }

    public static void main(String[] args) {
        CountAndSaySolution countAndSaySolution = new CountAndSaySolution();
        System.out.println(countAndSaySolution.countAndSay(4));
    }
}
