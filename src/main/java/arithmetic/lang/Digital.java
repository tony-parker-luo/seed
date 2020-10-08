package arithmetic.lang;

import java.util.ArrayList;
import java.util.List;

public class Digital {
    public static void main(String[] args) {
        int num = 7659;
        int i = revInt(num);
        System.out.println(i);
        int[] a = {1, 2, 3, 4, 5};
        int[] b = revArray(a);
        for (int j : b) {
            System.out.print(j);
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
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
//            System.out.print(num % 10);
            num = num / 10;
        }

        StringBuilder buffer = new StringBuilder();
        for (Integer integer : list) {
            buffer.append(integer);
        }
        return Integer.parseInt(buffer.toString());
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
