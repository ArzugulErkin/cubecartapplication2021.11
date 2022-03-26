package com.unitedcoder.datetime;


import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.util.Set;


public class JodaDateTime {
    public static void main(String[] args) {
        //define a new joda date time
        DateTime date=new DateTime();
        System.out.println(date);
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        System.out.println(date.toString(formatter));

        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println("Universal Time "+universalTime);
        Set<String> timeZones= ZoneId.getAvailableZoneIds();
        for(String s:timeZones){
            System.out.println(s);
        }
        DateTimeZone urumqiTime=DateTimeZone.forID("Asia/Urumqi");
        DateTime time=new DateTime(urumqiTime);
        System.out.println("Urumqi time is: "+time);

        System.out.println(universalTime.getDayOfMonth());
        System.out.println(universalTime.getMonthOfYear());
        System.out.println(universalTime.getYear());

        //get day name
        DateTime.Property dayName=universalTime.dayOfWeek();
        System.out.println(dayName.getAsShortText());

        //get difference
        DateTime beginDate=new DateTime("2022-01-10");
        DateTime endDate=new DateTime();
        Period period=new Period(beginDate,endDate, PeriodType.days());
        System.out.println(period.getDays());
    }
}
