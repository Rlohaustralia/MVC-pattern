package servletAndJsp.memberManagement.web.frontController.v2.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servletAndJsp.memberManagement.domain.member.Member;
import servletAndJsp.memberManagement.domain.member.MemberRepository;
import servletAndJsp.memberManagement.web.frontController.MyView;
import servletAndJsp.memberManagement.web.frontController.v2.ControllerV2;

import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2 {

    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        request.setAttribute("member",member);
        return new MyView("/WEB-INF/views/save-result.jsp");

    }
}

