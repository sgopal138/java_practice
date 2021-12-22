package com.practice.corejava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCompare {
	
	public static void main(String[] args) {
		System.out.println(compareTime(Calendar.getInstance().getTime(), 8, 0));
		
		System.out.println(compareDates("yyyy-MM-dd", "2020-02-10","2020-02-10"));
	}
	public static boolean compareDates(String dateFormat, String d1, String d2)
    {
        boolean isValidDate = false;
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(d2);

            if(date1.after(date2)){
                isValidDate = true;
            } else if(date1.before(date2)){
                isValidDate = false;
            } else if(date1.equals(date2)){
                isValidDate = false;
            }
        }
        catch(ParseException ex){
            ex.printStackTrace();
        }
        return isValidDate;
    }
	
	public static boolean compareTime(Date date, int hour_of_day, int mintue) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, hour_of_day);//SET 8 AM calendar time
        cal.set(Calendar.MINUTE, mintue);

        Calendar dateCal = Calendar.getInstance();
        dateCal.setTime(date);

        return cal.getTime().before(dateCal.getTime());
    }
}


