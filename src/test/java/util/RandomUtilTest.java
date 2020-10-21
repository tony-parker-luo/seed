package util;

import junit.framework.TestCase;

/**
 * @Description 随机数测试类
 * @Author Galen Luo
 * @Version 1.0.0
 * @Date 2020/10/21 13:14
 */
public class RandomUtilTest extends TestCase {

    public void testNextInt() {
        int i = RandomUtil.nextInt(10);
        assertTrue(i > 0 && i < 10);
    }
}