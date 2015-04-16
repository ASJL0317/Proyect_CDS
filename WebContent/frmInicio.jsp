<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- 
	jquerytheme: Es el estilo que se ha escogido 
	http://struts.jgeppert.com/struts2-jquery-showcase/index.action
	
	jquerytheme="cupertino"
	jquerytheme="blitzer"
-->
<sj:head jqueryui="true" jquerytheme="blitzer"/>
<title>Insert title here</title>
</head>
<body>

<h1>Encuentra tu lugar de Votación</h1>
<s:actionmessage theme="jquery"/>

<s:form action="votacion">
	DNI<s:textfield  name="dni" />
	Nombres<s:textfield  name="nombres" />
	APELLIDO<s:textfield name="apellido" />
	<sj:submit button="true" value="enviar"/>
</s:form>



</body>
</html>
