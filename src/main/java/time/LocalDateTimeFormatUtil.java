package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description 当前时间格式化
 * @Author Galen Luo
 * @Version 1.0.0
 * @Date 2020/10/21 14:47
 */
public class LocalDateTimeFormatUtil {
    public static String format(LocalDateTime localDateTime, DateTimeFormatter formatter) {
        if (null == localDateTime) {
            return null;
        }

        if(null == formatter){
            formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        }

        return formatter.format(localDateTime);
    }
}
