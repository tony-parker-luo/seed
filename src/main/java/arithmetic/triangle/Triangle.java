package arithmetic.triangle;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("calculateArea(10,15,5) = " + calculateArea(12, 18, 15));
    }

    /**
     * 已知三角形的三条边为a, b, c, 求三角形的面积。
     * 公式如下：
     * 周长的一半 = s = (a + b + c) / 2;
     * 面积 = √(s(s -a)(s -b)(s - c));
     *
     * @return
     */
    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
