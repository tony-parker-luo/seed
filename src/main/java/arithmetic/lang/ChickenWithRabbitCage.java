package arithmetic.lang;

/**
 * 鸡兔同笼：笼子里有若干只鸡和兔。从上面数，有8个头，从下面数，有26只脚。鸡和兔各有几只？
 * 解题思路：
 * 列方程，并解方程组。
 * <p>
 * 解题过程：
 * 设j代表鸡；t代表兔；
 * j + t = 8;      j = 8 - t;              j = 3;
 * 2j + 4t = 26;   2(8 - t) + 4t = 26;     t = 5;
 * <p>
 * 结论：
 * 兔子有5只，鸡有3只。
 */
public class ChickenWithRabbitCage {


    public static void main(String[] args) {
        int head = 8;
        int foot = 26;
        chickenWithRabbitCage(head, foot);
    }

    /**
     * 鸡兔同笼问题：穷举算法思想
     *
     * @param head 头的总数量
     * @param foot 脚的总数量
     */
    public static void chickenWithRabbitCage(int head, int foot) {
        int rabbit;
        int chicken;
        for (chicken = 0; chicken <= head; chicken++) {
            rabbit = head - chicken;
            if (isRight(foot, chicken, rabbit)) {
                System.out.printf("鸡有 %d 只，兔有 %d 只。 \n", chicken, rabbit);
            }
        }
    }

    private static boolean isRight(int foot, int chicken, int rabbit) {
        return chicken * 2 + rabbit * 4 == foot;
    }
}
