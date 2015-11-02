package com.example;

/**
 * 时间的有关计算
 *
 * @author 刘浩 2015-11-02 20:10:14
 * @version 1.1.0
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public final class TimeCalculate{
    /**
     * 秒数是否大于一天
     *
     * @param pSeconds 指定秒数
     * @return 1：大于,0：等于，-1：小于
     */
    public static byte secondsNumberIfMoreThanOneDay(long pSeconds){

        if (TimeConstant.getPerDayNumberOfHours() * TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds() > pSeconds) {
            return 1;
        } else if (TimeConstant.getPerDayNumberOfHours() * TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds() == pSeconds) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * 秒数是否大于十二小时
     *
     * @param pSeconds 指定秒数
     * @return 1：大于,0：等于，-1：小于
     */
    public static byte secondsNumberIfMoreThanTwelveHour(long pSeconds){

        if ((TimeConstant.getPerDayNumberOfHours() / 2) * TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds() > pSeconds) {
            return 1;
        } else if ((TimeConstant.getPerDayNumberOfHours() / 2) * TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds() == pSeconds) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * 秒数大于多少小时
     *
     * @param pSeconds 秒数
     * @return 大于的小时数，取值范围：0至23。若提供的秒数大于1天的总秒数时返回-1
     */
    public static byte secondsNumberMoreThanHourNumber(long pSeconds){
        if (0 < secondsNumberIfMoreThanOneDay(pSeconds)) {
            return -1;
        }
        return (byte) (pSeconds / (TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds()));

    }

    /**
     * 秒数是否大于一小时
     *
     * @param pSeconds 指定秒数
     * @return 1：大于,0：等于，-1：小于
     */
    public static byte secondsNumberIfMoreThanOneHour(long pSeconds){
        if (TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds() > pSeconds) {
            return 1;
        } else if (TimeConstant.getPerHourNumberOfMinutes() * TimeConstant.getPerMinuteNumberOfSeconds() == pSeconds) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * 秒数大于多少分钟
     *
     * @param pSeconds 秒数
     * @return 大于的小时数，取值范围：0至59。若提供的秒数大于1小时的总秒数时返回-1
     */
    public static byte secondsNumberMoreThanMinuteNumber(long pSeconds){
        if (0 < secondsNumberIfMoreThanOneHour(pSeconds)) {
            return -1;
        }
        return (byte) (pSeconds / TimeConstant.getPerMinuteNumberOfSeconds());
    }
}
