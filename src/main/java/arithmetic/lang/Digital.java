package arithmetic.lang;

public class Digital {
    public static void main(String[] args) {
        int num = 7659;
        revInt(num);
        System.out.println();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = revArray(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
    }

    /**
     * 将输入的数字反转。
     * 例如：1024 输出 4201
     * 思路：
     * 将 num 取余，得到最低位的数字并依次打印；取余后，将 num / 10, 以此进位。
     */
    public static int revInt(int num) {
        while (num != 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
        return num;
    }

    /**
     * 数组反转。
     * int[] a = {1, 2, 3, 4, 5};
     * int[] b = {5, 4, 3, 2, 1};
     */
    public static int[] revArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }
}
