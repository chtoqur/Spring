public class MemberApp {
    public static void usedMember1()
    {
        Member m1 = new Member("홍길동", "의적");
        System.out.println(m1.getName());
        System.out.println(m1.getNickname());
    }

        public static void usedMember2(Member member)
    {
        Member m1 = member;
        System.out.println(m1.getName());
        System.out.println(m1.getNickname());
    }

    public static void main(String[] args) throws Exception {
        
        // 만약 메인함수가 스프링프레임워크라고 가정한다면
        // 메인함수보다 usedMember1()이 먼저 만들어진 상황.
        // 이 때, usedMember1()의 내용을 스프링프레임워크 본인이
        // 수정하거나 만지는 등의 핸들링을 할 수 없다.
        // 즉, usedMember1()와 이 함수 안에서 사용하는 객체 등은
        // 메인함수와 독립적으로 존재함
        usedMember1();

        // usedMember2()는 외부에서 이 함수가 사용하는 객체를 파라메터로 넘긴다.
        // 따라서 usedMember2()는 프레임워크(main)에서 관리 되어질 수 있다.
        Member mem = new Member("홍길동", "의적");
        usedMember2(mem);
        // 다만 usedMember2()는 전제되어야 할 사항이 두 가지 존재함.
        // 1. 객체를 할당할 때 객체의 생성조건을 만족시킬 수 있어야 함
        // 2. 프레임워크(main)가 객체의 생성-설정-안정성 등을 책임져야 함
        //    (Member가 메인함수에서 만들어졌기 때문)
        // => 객체에 대한 권한을 프레임워크(전문가)에 맡기는 것이 안전함
        
        usedMember2(mem);
        // 파라메터 안에 들어가는 것이 객체가 될 수도 있지만,
        // 다른 여러가지 형식의 데이터가 될 수 있기 때문에 '의존성 주입'
        // 실제 돌아가는 함수는 usedMember2()인데, 이 함수를 돌리기 위해서는
        // 외부에 있는 파라메터값이 필요함. ==> 함수가 파라메터에 의존적 ==> 
        // ==> 이 함수를 가지고 있는 프레임워크(main)는 의존성을 지니고 있음
        // ==> 의존성을 주입받으면 만족도가 높아짐
        

    }
}
