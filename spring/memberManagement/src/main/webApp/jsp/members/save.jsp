<%@ page import="servletAndJsp.memberManagement.domain.member.MemberRepository" %>
<%@ page import="servletAndJsp.memberManagement.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
MemberRepository memberRepository = MemberRepository.getInstance();
System.out.println("save.jsp");
String username = request.getParameter("username");
int age = Integer.parseInt(request.getParameter("age"));
Member member = new Member(username, age);
System.out.println("member = " + member);
memberRepository.save(member);
%>

<html>
<head>
    <meta charset="UTF-8">
</head>
<body> Successfully saved
<ul>
     <li>id=<%=member.getId()%></li>
     <li>username=<%=member.getUsername()%></li>
     <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">MAIN</a>
</body>
</html>