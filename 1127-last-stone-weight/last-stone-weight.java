import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {

        int n = stones.length;

        while (n > 1) {

            Arrays.sort(stones, 0, n);

            int a = stones[n - 1];
            int b = stones[n - 2];

            if (a == b) {
                n = n - 2;
            } else {
                stones[n - 2] = a - b;
                n = n - 1;
            }
        }

        if (n == 0) {
            return 0;
        }

        return stones[0];
    }
}