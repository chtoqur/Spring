package com.study.exam07_board.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// @Repository
// UserDAO를 통해서 데이터를 접근하고 관리할 것이라는 의미를 스프링프레임워크에 전달함
// 스프링프레임워크는 UserDAO 클래스를 통해 JDBC와 실질적으로 접근할 수 있게 해줌
@Repository
public class UserDAO {

    // Dao : DB 속 data에 접근하기 위한 객체
    // DAO를 잘 사용하기 위한 라이브러리 = Mybatis

    // @Autowired : 참조변수만 적어놓으면 프레임워크가
    // 알아서 객체를 생성해서 넣어줌
    // SqlSessionTempltate : Mybatis에서 제공하는 템플릿
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    // JDBC와 통신해서 쿼리를 던질 수 있는 객체
    // 하지만 의존성 때문에 사용자가 직접 SqlSessionTemplate 객체를
    // 생성하는 것은 불가능함

    // 어떤 DB와 드라이버를 접근할 것인지, 어떤 테이블로 접속해야하는지 등
    // 모든 의존성을 원래는 프로그래머가 직접 코딩해줘야 함
    // 따라서 스프링프레임워크에게 이미 설정된 여러 정보를 가져다가
    // 객체를 외부에서 만들어서 의존성 주입으로 넣어달라고 부탁하는 것

    public UserTblVO selectOneUser(UserTblVO vo) throws Exception
    {
        // SELECT * FROM USER_TBL WHERE USERID=jsh' AND USERPW='1234'
        // 쿼리의 결과가 '1개'일 때 이용하는 함수 = selectOne
        // "selectOneUser"라는 쿼리를 던져서 결과를 vo에 저장
        return sqlSessionTemplate.selectOne("selectOneUser", vo);
        // 쿼리에 대한 결과는 메인 컨트롤러에서 받아서 작업함
        // 쿼리를 던질 때 SQL 언어로 던지는 것 (X), XML로 생성 (O)
        // 이유1 : 코드의 가독성 (SQL의 과도한 더하기 연산을 없애서 깔끔하게 만들기)
        // 이유2 : 쿼리를 날렸을 때 출력되는 결과를 VO에 넣어야 하는데
        //         컬럼에는 순서가 없기 때문에 VO의 어떤 컬럼에 어떤 데이터를
        //         넣어야 하는지 매칭할 수가 없음 -> 
    }

}
