package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired      // Dependency Injection. Controller와 service 연결 (controller가 생성될 때 spring bean에 등록된 service 객체 넣어줌)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
