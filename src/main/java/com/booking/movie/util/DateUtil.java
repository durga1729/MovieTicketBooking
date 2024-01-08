package com.booking.movie.util;

import lombok.Setter;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateUtil {

    public static Date getDate(String date) throws ParseException {
        Date dateFormat = new SimpleDateFormat("dd/MM/yyyy")
                .parse(date);
        return dateFormat;
    }

    public Timestamp getTimeStamp() {
        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        return ts;
    }
}
