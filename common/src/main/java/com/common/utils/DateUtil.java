package com.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xiaomi
 * @create 2020/11/20
 **/
public class DateUtil {
    /**
     * 日期转格式字符串
     *
     * @param date   日期
     * @return
     */
    public static String getFormatDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
    public static String getFormatDate(String format, Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 日期计算
     *
     * @param format   格式
     * @param date     日期
     * @param category 年,月,日;Calendar.YEAR,Calendar.MONTH,Calendar.DATE
     * @param num      数量 加1天:1,减一天:-1
     * @return
     */
    public static String getDate(String format, Date date, int category, int num) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(category, num);
        Date date2 = calendar.getTime();
        return dateFormat.format(date2);
    }
}
