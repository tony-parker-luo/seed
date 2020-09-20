package benchmark;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> stringHashMap = new HashMap<>(16);
        HashMap<String,String> stringHashMap2 = new HashMap<>(17);
        HashMap<String,String> stringHashMap3 = new HashMap<>(33);

        stringHashMap.put("1","1");
    }
}
