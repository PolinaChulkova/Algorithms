import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String str) {
        int longest = 0;
        int start = 0;
        int end = 0;
        for (int i = 1; i < str.length(); i++) {
            int mid1 = getLengthPalindrome(str, i, i);
            int mid2 = getLengthPalindrome(str, i - 1, i);

            int length = Math.max(mid1, mid2);
            if(length > longest) {
                longest = length;
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return str.substring(start, end + 1);
    }

    public static int getLengthPalindrome(String str, int L, int R) {
        while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
