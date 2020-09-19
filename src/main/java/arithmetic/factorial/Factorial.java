package arithmetic.factorial;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial(n) = " + factorial(n));
    }

    /**
     * 求阶乘：
     * 求n的阶乘：1 x 2 x 3 x ... x n
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
