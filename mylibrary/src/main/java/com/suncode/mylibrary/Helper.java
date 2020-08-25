package com.suncode.mylibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Helper {

    public static String getNameDay() {
        Locale id = new Locale("in", "ID");
        String pattern = "EEEE";
        Date today = new Date();

        // Gets formatted date specify by the given pattern for
        // Indonesian Locale no changes for default date format
        // is applied here.
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, id);
        return sdf.format(today);
    }

}
