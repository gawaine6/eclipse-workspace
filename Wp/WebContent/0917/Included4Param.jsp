<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.*" %>
    Today is ${param.dateStr} <br>
    <!--
    파라미터에 넣을 이름을 입력해준다
    이건
    표현문으로 바꾸면 표현문 request.getParameter("dateStr") 표현문
    ${param.dateStr}
    이렇게 바꿀 수 있다
    -->
    <%= "title parameter: " + URLDecoder.decode(request.getParameter("title"), "utf-8") %>