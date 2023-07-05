package com.study.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.di.beans.*;

// @SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DiApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// context가 관리하는 Bean에서 "MemberLogin"이라는 Bean(관리되어지는 객체)을 찾아서
		// 참조변수 login에 물려주는 것
		Login obj = context.getBean("MemberLogin", Login.class);
		obj.login("jsh", "1234");

		// 객체를 생성하는 녀석 = 팩토리

		// Creating shared instance of singleton bean 'MemberLogin
		// 데이터베이스 연결 완료
		// SELECT * FROM USER_TBL WHERE userid=jsh AND userpw=1234
		
		// Bean이 singleton으로 생성된 이유
		// 로그인 매커니즘은 모두 동일하기 때문에 재활용하겠다는 것


	}

}
