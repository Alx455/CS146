
public class Main {

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;

        int[] sumCounts = new int[amount + 1];
        sumCounts[0] = 0;
        for (int i = 1; i < sumCounts.length; i++) {
            sumCounts[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && sumCounts[i - coins[j]] != Integer.MAX_VALUE)
                    if (sumCounts[i] > sumCounts[i - coins[j]])
                        sumCounts[i] = sumCounts[i - coins[j]] + 1;
            }
        }
        if (sumCounts[amount] == Integer.MAX_VALUE)
            return -1;
        else
            return sumCounts[amount];
    }

    public static void main(String[] args) {
        
    }
}
