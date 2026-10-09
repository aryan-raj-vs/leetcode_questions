class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int n = 0;

            char ch = s.charAt(i);

            if (ch == 'I') n = 1;
            else if (ch == 'V') n = 5;
            else if (ch == 'X') n = 10;
            else if (ch == 'L') n = 50;
            else if (ch == 'C') n = 100;
            else if (ch == 'D') n = 500;
            else if (ch == 'M') n = 1000;

            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);

                if ((ch == 'I' && (next == 'V' || next == 'X')) ||
                    (ch == 'X' && (next == 'L' || next == 'C')) ||
                    (ch == 'C' && (next == 'D' || next == 'M'))) {
                    ans -= n;
                } else {
                    ans += n;
                }
            } else {
                ans += n;
            }
        }

        return ans;
    }
}