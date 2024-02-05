def palindrome(target):
    if not target:
        return True
    for i in range(0, len(target)//2 + 1):
        if (target[i] != target[len(target) - 1 - i]):
            return False
    return True

