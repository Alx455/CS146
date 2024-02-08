def first_bad_version(n):
    left = 1
    right = n
    mid = None
    prev = 0
    while (left <= right):
        mid = (left + right) // 2;
        if (isBadVersion(mid)):
            prev = mid
            right = mid - 1
        elif (!isBadVersion(mid)):
            left = mid + 1
    return prev
