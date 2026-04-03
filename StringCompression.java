public class StringCompression {
    public static String compress(String s) {
        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                res.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return res.toString();
    }
}