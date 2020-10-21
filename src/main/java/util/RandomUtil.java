package util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description 产生一个随机数
 * @Author Galen Luo
 * @Version 1.0.0
 * @Date 2020/10/21 13:12
 */
public class RandomUtil {

    public static int nextInt(int bound) {
        return ThreadLocalRandom.current().nextInt(bound);
    }
}
