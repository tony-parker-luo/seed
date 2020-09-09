package arithmetic.search;

import java.util.Arrays;

public class binary {

    public static void main(String[] args) {
        int[] arr = {16, 18, 19, 5, 32, 77, 61};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 31));
        System.out.println("7 >>> 2 = " + (7 >>> 1));
    }

}
