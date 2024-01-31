package servletAndJsp.memberManagement.web.usingServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servletAndJsp.memberManagement.domain.member.Member;
import servletAndJsp.memberManagement.domain.member.MemberRepository;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "memberSave", urlPatterns = "/management/members/save")
public class MemberSave extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get parameters
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        // Create new member instance and save it into the repository
        Member member = new Member(username, age);
        memberRepository.save(member);

        // Set response
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();

        writer.write("<html>\n" +
                "<head>\n" +
                " <meta charset=\"UTF-8\">\n" + "</head>\n" +
                "<body>\n" +
                "Successfully saved!\n" +
                "<ul>\n" +
                "    <li>id="+member.getId()+"</li>\n" +
                "    <li>username="+member.getUsername()+"</li>\n" +
                " <li>age="+member.getAge()+"</li>\n" + "</ul>\n" +
                "<a href=\"/index.html\">Go back to main page</a>\n" + "</body>\n" +
                "</html>");




    }
}
