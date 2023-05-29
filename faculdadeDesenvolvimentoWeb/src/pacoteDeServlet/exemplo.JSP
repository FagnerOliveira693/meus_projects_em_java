<!DOCTYPE html>

<html>
<head>
<title>Minha página em JSP! </title>

</head>
<body>
<h3>Teste JSP - scriptlet</h3>

<%
String nome = "Fagner Miguel!";
byte idade = 30;
out.println("O " + nome + " tem " + idade + " Anos! ");

%>

</body>


</html>