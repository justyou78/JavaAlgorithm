package com.kakao.intern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		System.out.println(sdf.format(d));
	}
}
