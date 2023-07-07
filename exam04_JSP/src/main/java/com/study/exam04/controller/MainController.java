package com.study.exam04.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    
    // GET방식으로 요청이 들어왔을 때, GET 방식으로 받겠다는 것
    // /hello라는 GET 방식으로 들어왔을 때, "hello"를 model에 리턴하겠다는 것
    // model 측에서 단순한 문자열만으로는 수행할 작업이 없으므로 view로 넘어감
    // view는 화면을 전달해주는 사람이므로 
    @GetMapping("/exam01_hello")
    public String exam01_hello()
    {
        System.out.println("Receive Hello Get Request!");
        return "exam01_hello";
    }

    @GetMapping("/exam01_login")
    public String exam01_login()
    {
        // 코드 작성
        System.out.println("Success");
        return "exam01_login";
    }

    @PostMapping("/loginProc")
    public String loginProc(String userId, String userPw)
    {
        System.out.println("id : " + userId);
        System.out.println("pw : " + userPw);

        return "hello";
    }

    // exam 문자열이 리턴되면 컨트롤러 > view > 프리픽스-서브픽스 붙여서
    // exam.jsp 파일을 로딩해서 처리 후 던져줌
    @GetMapping("/exam")
    public String exam()
    {
        return "exam";
    }

    @GetMapping("/exam04_date")
    public String exam04_date()
    {
        return "exam04_date";
    }

    @GetMapping("/exam02_try")
    public String exam02_try()
    {
        return "exam02_try";
    }

    @GetMapping("/exam03_gugudan")
    public String exam03_gugudan()
    {
        return "exam03_gugudan";
    }

    @GetMapping("/exam04_request")
    public String exam04_request()
    {
        return "exam04_request";
    }

    @GetMapping("/exam04_request_info")
    public String exam04_request_info()
    {
        return "exam04_request_info";
    }

    @PostMapping("/exam04_request_info")
    public String exam04_request_info_post()
    {
        return "exam04_request_info";
    }

    @PostMapping("/exam04_request_value")
    public String exam04_request_value()
    {
        return "exam04_request_value";
    }

    @GetMapping("/exam05_response")
    public String exam05_response()
    {
        return "exam05_response";
    }

    @PostMapping("/exam05_response_info")
    public void exam05_response_info(String userId, String userPw,
                                       HttpServletRequest request,
                                       HttpServletResponse response) throws Exception
    {
        System.out.println("ID : " + userId);
        System.out.println("PW : " + userPw);

        if ((userId.equals("abc")) && (userPw.equals("1111")))
        {
            // 로그인 성공 - 메인페이지로
            response.sendRedirect("exam01_hello");
        }
        else
        {
            // 로그인 실패 - 로그인 페이지로
            response.sendRedirect("exam05_response");
        }
    }

    @GetMapping("/exam06_out")
    public String exam06_out()
    {
        return "exam06_out";
    }
}
