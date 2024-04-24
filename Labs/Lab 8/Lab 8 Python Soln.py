
def coinChange(coins: list[int], amount: int) -> int:
    if amount == 0:
        return 0

    sumCounts = [float('inf')] * (amount + 1)
    sumCounts[0] = 0
    
    for i in range(0, amount+1):
        for j in range(0, len(coins)):
            if (coins[j] <= i and sumCounts[i - coins[j]] != float('inf')):
                if (sumCounts[i] > sumCounts[i - coins[j]]):
                    sumCounts[i] = sumCounts[i - coins[j]] + 1
    if sumCounts[amount] == float('inf'):
        return -1
    else:
        return sumCounts[amount]
