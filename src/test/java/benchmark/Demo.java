package benchmark;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
       /* int k =7;
        do {
            System.out.println(k--);
            k--;
        } while (k >= 0);*/

//        System.out.println("\'");
//        System.out.println("\41");
//        System.out.println("\u0061");

        String s = null;
/*        if ((s == null) && s.length() > 0) {

        }
*/
        if ((s != null) && s.length() > 0) {

        }

/*        if ((s == null) | s.length() == 0) {

        }*/

        if ((s == null) || s.length() == 0) {

        }

        int[][] x = {{1, 2, 3}, {}, {3, 4, 5}, {6, 7}};
        System.out.println("x.length = " + x.length);
        System.out.println("x[2].length = " + x[2].length);
//        System.out.println("x[1][0] = " + x[1][0]);
        System.out.println("x[3][1] = " + x[3][1]);

//        BufferedReader in1 = new BufferedReader(new FileReader("")); ✔
//        BufferedReader in2 = new BufferedReader(new Reader("a.dat"));
//        BufferedReader in3 = new BufferedReader(new FileInputStream("a.dat"));
//        BufferedReader in4 = new BufferedReader(new InputStream("a.dat"));

        byte b = 10;
        int i = 60;
        System.out.println("sum = " + (b + (byte) i));

//        BufferedWriter writer = new BufferedWriter(new FileWriter(""));
//        writer.write("a");
//        writer.flush();
//        writer.close();

        Color color = new Color(255, 9, 255);

        int c;
//        System.out.println("c = " + c);

        LinkedList<String> list = new LinkedList<>();

        // Deque
        list.offer("a");
        list.offer("b");
        list.offer("c");

        String s1 = list.pop();
        System.out.println(" list.pop()() = " + s1);
        list.push(s1);
        System.out.println("list.getFirst() = " + list.getFirst());


        ArrayList<String> arrayList = new ArrayList<>(50000);
        arrayList.add("1");

        int[] original = {57, 81, 65, 43, 21};
        System.out.print("original = {");
        for (int o : original) {
            System.out.print(o + ", ");
        }
        System.out.println("}");

        int[] destination = Arrays.copyOf(original, 8);
        System.out.print("destination = {");
        for (int o : destination) {
            System.out.print(o + ", ");
        }
        System.out.println("}");
        System.out.println("destination.length = " + destination.length);

        int[] copyOfRange = Arrays.copyOfRange(original, 1, 3);
        System.out.print("copyOfRange = {");
        for (int o : copyOfRange) {
            System.out.print(o + ", ");
        }
        System.out.println("}");
        System.out.println("copyOfRange.length = " + copyOfRange.length);

    }
}
