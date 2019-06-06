package com.example.singleton;

//
/*
 *싱글톤 패턴이란 ? 
 * 단 하나의 인스턴스를 생성해 사용하는 디자인 패턴!
 * 한번의 new로 고정된 메모리 영역을 얻어 인스턴스를 사용하여 메모리 낭비를 방지 할 수 있다!
 * 전역인스턴스이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유할 수 있고,
 * 대게 DBCP처럼 고옹된 객체를 여러개 생성해서 사용하는 상황에서 많이 사용한다!
 * (쓰레드풀,캐시,대화상자,사용자 설정,레지스트리 설정, 로그 기록 객체 등)  
 */
public class Singleton {
	DriverManagerDataSource dataSource =  new DriverManagerDataSource();
	
	
}

class DriverManagerDataSource{
	String driverClassName ="net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	String url = "jdbc:log4jdbc:oracle:thin:@localhost:1521:xe";
	
}
/*
 * 밑의 내용은 Spring에서 root-context.xml의 하나의 빈을 설정하는 과정
 * 그 과정을 JAVA코드로 나타낸 것이 위의 코드!
 * 밑의 내용처럼 서블릿에 빈으로 설정을 해 놓으면 그 내용을 싱글톤 패턴처럼 메모리에 올라가 어디서든 쓸 수 있게 해준다.
 * 
 */

/*
 * 알아두자! mybatis관련 bean
 * ---------------------------------
 * sqlSession
 * reference <sqlSessionFactory>
 * ---------------------------------
 * sqlSessionFactory
 * dataSource
 * configLocation
 * mapperLocations
 * ---------------------------------
 * dataSource
 * driverClassName
 * url
 * username
 * password
 * ----------------------------------
 * 
 * 
 */


/*
 * <bean id="dataSource"
 * class="org.springframework.jdbc.datasource.DriverManagerDataSource"> <!--
 * 드라이버 클래스 이름이 변경됨 --> <property name="driverClassName"
 * value="net.sf.log4jdbc.sql.jdbcapi.DriverSpy"></property> <!-- 연결문자열에
 * log4jdbc가 추가됨 --> <property name="url"
 * value="jdbc:log4jdbc:oracle:thin:@localhost:1521:xe" /> <property
 * name="username" value="spring" /> <property name="password" value="1234" />
 * </bean>
 */