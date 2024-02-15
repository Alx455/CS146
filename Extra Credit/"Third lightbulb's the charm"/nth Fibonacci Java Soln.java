public class Main {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int fib = -1;
        int beforePrev = 0;
        int prev = 1;
        for (int i = 1; i < n; i++) {
            fib = beforePrev + prev;
            beforePrev = prev;
            prev = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
