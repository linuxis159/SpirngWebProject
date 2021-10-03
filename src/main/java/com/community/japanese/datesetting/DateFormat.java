package com.community.japanese.datesetting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static String setDateFormat(Date ragDate){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 mm분 ss초");
		String afterFormat  = simpleDateFormat.format(ragDate);
		return afterFormat;
		
	}

}
