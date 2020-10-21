package time;

import junit.framework.TestCase;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * @Description 时间日期单元测试
 * @Author Galen Luo
 * @Version 1.0.0
 * @Date 2020/10/21 14:43
 */
public class TimeUtilTest extends TestCase {

    public void testDateFormat() {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(3);
        String dateTime = LocalDateTimeFormatUtil.format(localDateTime, DatePattern.NORM_DATETIME_FORMAT);
        System.out.println("dateTime = " + dateTime);
        assertNotNull("当前时间为空", dateTime);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-1);
        date = calendar.getTime();
        String format = sdf.format(date);
        System.out.println("format = " + format);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + r.nextInt(9));
        }
    }

}