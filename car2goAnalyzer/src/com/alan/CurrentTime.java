package com.alan;


import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by alanli on 2015-10-03.
 */
public class CurrentTime {

    public static String getCurTime () {
        Date now = new Date();
        SimpleDateFormat nowFormatted = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String DateToStr = nowFormatted.format(now);
        return DateToStr;
    }

}
