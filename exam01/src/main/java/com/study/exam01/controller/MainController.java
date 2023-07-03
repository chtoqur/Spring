package com.study.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    
    // GET방식으로 요청이 들어왔을 때, GET 방식으로 받겠다는 것
    // /hello라는 GET 방식으로 들어왔을 때, "hello"를 model에 리턴하겠다는 것
    // model 측에서 단순한 문자열만으로는 수행할 작업이 없으므로 view로 넘어감
    // view는 화면을 전달해주는 사람이므로 
    @GetMapping("/hello")
    public String hello()
    {
        System.out.println("Receive Hello Get Request!!!!");
        return "hello";
    }

    @GetMapping("/login")
    public String login()
    {
        // 코드 작성
        System.out.println("Success");
        return "login";
    }

    @PostMapping("/loginProc")
    public String loginProc(String userId, String userPw)
    {
        System.out.println("id : " + userId);
        System.out.println("pw : " + userPw);

        return "hello";
    }
}
