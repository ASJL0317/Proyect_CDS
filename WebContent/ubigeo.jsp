<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UBIGEO</title>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>
<s:form id="idForm">
Departamento
<s:url id="idDepa" action="cargaUbigeo" />
<sj:select href="%{idDepa}" 
		   list="lstDepartamento" 
		   listKey="departamento"
		   listValue="departamento"  
		   headerKey=" " 
		   name="departamento"
		   headerValue="[Seleccione]" 
		   onChangeTopics="topicoProvincia,topicoDistrito"/><br>
		   
Provincia
<s:url id="idProv" action="cargaUbigeo" />
<sj:select href="%{idProv}" 
		   list="lstProvincia" 
		   listKey="provincia"
		   listValue="provincia"  
		   headerKey=" " 
		   name="provincia"
		   headerValue="[Seleccione]"
		   reloadTopics="topicoProvincia"
		   onChangeTopics="topicoDistrito" 
		   /><br>
Distrito
<s:url id="idDis" action="cargaUbigeo" />
<sj:select href="%{idDis}" 
		   list="lstDistrito" 
		   listKey="distrito"
		   listValue="distrito"  
		   headerKey=" " 
		   name="distrito"
		   headerValue="[Seleccione]"
		   reloadTopics="topicoDistrito" 
		   /><br>  
</s:form>		   
</body>
</html>

