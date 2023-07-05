package com.study.di.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    // 프레임워크 입장에서는 Config 클래스를 통해
    // 정보를 나눈다는 것을 모르기 때문에
    // @Configuration 어노테이션을 붙여줌

    // 객체가 Config를 통해서 생성되므로
    // 사용자는 객체 이름이 어떤 것으로 만들어질지 알 수 없음
    // 따라서 사용자가 그 이름을 지정해주는 것

    // 프레임워크가 Login 인스턴스를 가져왔을 때
    // "MemberLogin"이라는 이름으로 부르겠다는 것이며
    // 사용자뿐만 아니라 프레임워크 또한 "MemberLogin"으로 객체를 이름짓는다
    @Bean("MemberLogin")
    public Login getLoginInstance()
    {
        return new Login();
    }

}
