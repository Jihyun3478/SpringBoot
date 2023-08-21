package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    /* 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어줌 -> 의존관계 주입 */
    // 필드 주입
    //    @Autowired private final MemberService memberService;
    private final MemberService memberService;


    // setter 주입
    //   public void setMemberService(MemberService memberService) {
    //       this.memberService = memberService;
    //   }

    // 생성자 주입
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
