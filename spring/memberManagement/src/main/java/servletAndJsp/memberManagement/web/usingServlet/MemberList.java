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
import java.util.List;

@WebServlet(name = "memberList", urlPatterns = "/management/members")
public class MemberList extends HttpServlet {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Member> allMembers = memberRepository.findAllMembers();

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();

        writer.write("<html>");
        writer.write("<head>");
        writer.write("    <meta charset=\"UTF-8\">");
        writer.write("    <title>Title</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<a href=\"/index.html\">MAIN</a>"); writer.write("<table>");
        writer.write(" <thead>");
        writer.write(" <th>id</th>");
        writer.write(" <th>username</th>"); writer.write(" <th>age</th>");
        writer.write(" </thead>");
        writer.write(" <tbody>");

        for (Member member : allMembers) {
            writer.write("    <tr>");
            writer.write("       <td>" + member.getId() + "</td>");
            writer.write("       <td>" + member.getUsername() + "</td>");
            writer.write("       <td>" + member.getAge() + "</td>");
            writer.write("    </tr>");
        }
        writer.write("    </tbody>");
        writer.write("</table>");
        writer.write("</body>");
        writer.write("</html>");


    }
}
