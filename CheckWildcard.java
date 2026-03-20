public class CheckWildcard {

    public static boolean isMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // dp[i][j] = whether first i chars of text match first j chars of pattern
        boolean[][] dp = new boolean[n + 1][m + 1];

        // Empty pattern matches empty string
        dp[0][0] = true;

        // Handle patterns like *, **, ***
        for (int j = 1; j <= m; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                char p = pattern.charAt(j - 1);
                char t = text.charAt(i - 1);

                if (p == t || p == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                else if (p == '*') {
                    // * can match empty (dp[i][j-1]) OR one/more chars (dp[i-1][j])
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } 
                else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String pattern1 = "he?lo";
        String text1 = "hello";

        String pattern2 = "he?o";
        String text2 = "herlllllo";

        System.out.println(isMatch(text1, pattern1)); // true
        System.out.println(isMatch(text2, pattern2)); // true
    }
}