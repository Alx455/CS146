def fibonacci(n):
    if n <= 1:
        return n
    fib = -1
    beforePrev = 0
    prev = 1
    for i in range (1, n):
        fib = beforePrev + prev
        beforePrev = prev
        prev = fib
    return fib
