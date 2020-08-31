package arithmetic.sort;

public class Bubble {
    public void sort(int[] arr) {
        // 提取数组长度
        int len = arr.length;

        // 长度小于等于1，则不比较直接返回。
        if (len <= 1) {
            return;
        }

        // 外层循环表示要排len趟
        for (int i = 0; i < len; i++) {
            // 内层循环表示每趟要比较的次数
            for (int j = 0; j < len - i - 1; j++) {
                // 比较相邻两个数的大小，如果前面大于后面的数，就交换位置；否则不变。
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
