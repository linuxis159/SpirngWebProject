package com.community.japanese.datesetting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static String setDateFormat(Date ragDate){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� mm�� ss��");
		String afterFormat  = simpleDateFormat.format(ragDate);
		return afterFormat;
		
	}

}
