package OfferNo002AddBinary;

public class AddBinarySolution {
    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        a = fill(a, maxLen);
        b = fill(b, maxLen);
        int flag = 0;
        String res = "";
        for (int i = maxLen - 1; i > 0; i--) {
            char r;
            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (flag == 0) {
                    r = '0';
                } else {
                    r = '1';
                    flag = 0;
                }
            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (flag == 0) {
                    r = '0';
                } else {
                    r = '1';
                }
                flag = 1;
            } else {
                if (flag == 0) {
                    r = '1';
                } else {
                    r = '0';
                    flag = 1;
                }
            }
            res += r;
        }
        if (flag == 1) {
            res = "1" + res;
        }
        return res;
    }

    String fill(String a, int len) {
        if (a.length() < len) {
            String fill = "";
            for (int i = 0; i < len - a.length(); i++) {
                fill += "0";
            }
            a = fill + a;
        }
        return a;
    }
}
