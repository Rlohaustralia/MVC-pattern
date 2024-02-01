package servletAndJsp.memberManagement.web.frontController.v3.controller;

import servletAndJsp.memberManagement.domain.member.Member;
import servletAndJsp.memberManagement.domain.member.MemberRepository;
import servletAndJsp.memberManagement.web.frontController.ModelView;
import servletAndJsp.memberManagement.web.frontController.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> allMembers = memberRepository.findAllMembers();
        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members",allMembers);
        return modelView;

    }
}
