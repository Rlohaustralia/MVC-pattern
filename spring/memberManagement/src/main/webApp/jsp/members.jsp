<%@ page import="java.util.List" %>
<%@ page import="servletAndJsp.memberManagement.domain.member.MemberRepository" %>
<%@ page import="servletAndJsp.memberManagement.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();
    List<Member> allMembers = memberRepository.findAllMembers();
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="/index.html">MAIN</a>
<table>
    <thead>
    <th>id</th>
        <th>username</th>
        <th>age</th>
        </thead>
    <tbody>
    <%
        for (Member member : allMembers) {
            out.write("    <tr>");
            out.write("       <td>" + member.getId() + "</td>");
            out.write("       <td>" + member.getUsername() + "</td>");
            out.write("       <td>" + member.getAge() + "</td>");
            out.write("    </tr>");
        }
    %>
    </tbody>
 </table>
 </body>
 </html>
