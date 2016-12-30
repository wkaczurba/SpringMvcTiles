<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<h1>index.jsp</h1>
<p>Here is the main (index) content</p>
Links:
<ul>
  <li><a href="<s:url value="/about" />">About</a></li>
  <li><a href="<s:url value="/home" />">Home</a></li>
  <li><a href="<s:url value="/" />">Index</a></li>
  <li><a href="<s:url value="/profile" />">Profile</a></li>
</ul>


