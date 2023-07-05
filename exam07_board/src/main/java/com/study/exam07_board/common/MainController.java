package com.study.exam07_board.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.exam07_board.user.UserDAO;
import com.study.exam07_board.user.UserTblVO;

// http://localhost/???
@Controller
public class MainController {

    @Autowired
    private UserDAO userdao;
    
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    // @PostMapping("/login")
    // public String login(String userId, String userPw)
    // {
    //     System.out.println(userId);
    //     System.out.println(userPw);

    //     boolean result = false;

    //     // 디비를 연결해서 쿼리도 던지고 어쩌고 저쩌고해서 나온 결과 = result
    //     if (result == true)
    //     {
    //         return "index";
    //     }
    //     else
    //     {
    //         return "login";
    //     }
    // }
    
    // 1. 프레임워크님 UserTblVO 객체를 생성해주세요.
    // - new UserTblVO();
    // 2. request 객체에서 post로 넘어온 "userId", "userPw"값을
    // setUserId(), setUserPw() 함수를 통해서 객체에 저장해주세요.
    // 3. 마지막으로 UserTblVO 객체의 참조값을 login() 파라미터로 넣어주세요.

    @PostMapping("/login")
    public String login(@ModelAttribute("UserTblVO") UserTblVO vo) throws Exception
    {
        // @ModelAttribute
        // "UserTblVO"라는 클래스명을 줄테니 1,2,3 절차를 수행해줘

        // vo로 ID, PW를 받아서 userdao에 집어넣은 다음 쿼리를 날려서
        // 결과를 받아 resultVO에 넣는 것
        UserTblVO resultVO = userdao.selectOneUser(vo);

        if (resultVO == null)
        {
            return "login";
        }
        else
        {
            System.out.println("id = " + resultVO.getUserId());
            System.out.println("pw = " + resultVO.getUserPw());
            System.out.println("email = " + resultVO.getEmail());
            System.out.println("name = " + resultVO.getName());
            return "index";
        }

    }
}
