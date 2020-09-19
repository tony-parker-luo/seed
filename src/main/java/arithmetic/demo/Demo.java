package arithmetic.demo;

public class Demo {

    public static void main(String[] args) {
        System.out.println("calculate(3) = " + Math.round(calculate(3)));
    }


    /**
     * 已知变量n，请写出使用for语句计算S=1+1/2+1/3.....+1/n的代码。
     *
     * @param n
     * @return
     */
    public static double calculate(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        return sum;
    }
}
