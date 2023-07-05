package com.study.exam07_board.user;

import lombok.Data;

// USER_TBL에 쿼리 전송 후 나올 수 있는 결과(데이터)를 저장하는 공간
// 나올 수 있는 최대값(MAXIMUM)을 저장할 수 있는 공간의 크기로 만들어야 한다
// 이 때 최대값이란 테이블의 스키마 개수와 동일함
@Data
public class UserTblVO {

    private String userId;
    private String userPw;
    private String email;
    private String name;

    // VO는 생성자, 게터, 세터 생성이 필수적이므로
    // 번거롭기 때문에 롬복을 사용함 --> @Data
    
}
