package com.study.test.user;

import lombok.Data;

@Data
public class UserTblVO {

    private String userId;
    private String userPw;
    private String name;
    private String email;
    private String phoneNum;
    private String signupDate;
    
}
