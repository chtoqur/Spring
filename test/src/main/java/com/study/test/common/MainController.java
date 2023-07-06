package com.study.test.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.test.user.UserDAO;
import com.study.test.user.UserTblVO;

@Controller
public class MainController {

    @Autowired
    private UserDAO userdao;

    @GetMapping("/login_success")
    public String login_success()
    {
        return "login_success";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    
    @PostMapping("/login")
    public String login(@ModelAttribute("UserTblVO") UserTblVO vo) throws Exception
    {

        UserTblVO resultVO = userdao.selectOneUser(vo);

        if (resultVO == null)
        {
            return "login";
        }
        else
        {
            System.out.println("id = " + resultVO.getUserId());
            System.out.println("pw = " + resultVO.getUserPw());
            System.out.println("name = " + resultVO.getName());
            System.out.println("email = " + resultVO.getEmail());
            System.out.println("phone number = " + resultVO.getPhoneNum());
            System.out.println("signup date = " + resultVO.getSignupDate());

            return "login_success";
        }
    }
    
}
