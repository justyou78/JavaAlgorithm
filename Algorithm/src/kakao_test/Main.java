package kakao_test;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		Calendar c= Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(Calendar.MONTH);
		//첫날의 요일을 나타낸다.
		c.set(2019, 9,1);
		int bgnWeek = c.get(Calendar.DAY_OF_WEEK);	
		System.out.println(month);
		System.out.println(bgnWeek +"test");
		System.out.println(year + "년" + month+"월" + day+"일");
		System.out.println(hour + "시" + minute+"분" + second+"초");
		
	
	}
	
	  
}

