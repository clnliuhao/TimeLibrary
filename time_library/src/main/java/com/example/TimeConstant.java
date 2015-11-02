package com.example;

/**
 * 时间常量
 *
 * @author 刘浩 2015-11-02 19:01:54
 * @version 1.0.0
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public final class TimeConstant{
    /**
     * 每秒毫秒数
     */
    private static final short PER_SECOND_NUMBER_OF_MILLISECONDS = 1000;
    /**
     * 每分钟秒数
     */
    private static final byte PER_MINUTE_NUMBER_OF_SECONDS = 60;
    /**
     * 每小时分钟数
     */
    private static final byte PER_HOUR_NUMBER_OF_MINUTES = 60;
    /**
     * 每天小时数
     */
    private static final byte PER_DAY_NUMBER_OF_HOURS = 24;

    /**
     * 获取每天小时数值
     *
     * @return 每天小时数值
     */
    public static byte getPerDayNumberOfHours(){
        return PER_DAY_NUMBER_OF_HOURS;
    }

    /**
     * 获取每小时分钟数值
     *
     * @return 每小时分钟数值
     */
    public static byte getPerHourNumberOfMinutes(){
        return PER_HOUR_NUMBER_OF_MINUTES;
    }

    /**
     * 获取每分钟秒数值
     *
     * @return 每分钟秒数值
     */
    public static byte getPerMinuteNumberOfSeconds(){
        return PER_MINUTE_NUMBER_OF_SECONDS;
    }

    /**
     * 获取每秒毫秒数值
     *
     * @return 每秒毫秒数值
     */
    public static short getPerSecondNumberOfMilliseconds(){
        return PER_SECOND_NUMBER_OF_MILLISECONDS;
    }
}
