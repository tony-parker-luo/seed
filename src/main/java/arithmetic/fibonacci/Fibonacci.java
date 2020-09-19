package arithmetic.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println("fibonacci(n) = " + fibonacci(n));
        System.out.println("fibonacci1(n) = " + fibonacci1(n));
    }

    /**
     * 斐波那契数列：递归方式实现
     * 规则：第n项的值是第（n-1）+ （n-2）项之和
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        int fn = 0;
        if (n == 1 || n == 2) {
            fn = 1;
        } else {
            fn = fibonacci(n - 2) + fibonacci(n - 3);
        }

        return fn;
    }

    /**
     * 斐波那契数列：循环的方式实现
     * @param n
     * @return
     */
    public static int fibonacci1(int n) {
        int fn = 0;
        int f1 = 1;
        int f2 = 1;

        if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 3; i <= n; i++) {
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
        }

        return fn;
    }

}
