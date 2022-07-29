<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859
<html>
<head>
   <title></title>
</head>
<body>
   <%! int cont = 1; %> <!--Declaração-->>
   Este é o acesso de número: <%= cont %>
   <% cont = cont + 1; %>
</body>
</html>