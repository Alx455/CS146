def palindrome(target):
    if not target:
        return True
    low = target.lower()
    for i in range(0, len(low)//2 + 1):
        if (low[i] != low[len(low) - 1 - i]):
            return False
    return True
