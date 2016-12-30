<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ page session="false" %>

<html>
  <head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="<s:url value="/resources/style.css" />"/>
  </head>
  <body>
    <div id="header">
      <t:insertAttribute name="header" />
    </div>
    <div id="body">
      <t:insertAttribute name="body" />
    </div>
    <div id="footer">
      <t:insertAttribute name="footer" />
    </div>    
  </body>
</html>