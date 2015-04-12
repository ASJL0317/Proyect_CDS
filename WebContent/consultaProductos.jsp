<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Productos por Rang de Precios</title>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>
<h1>Sede por Rango de Precios:</h1>
<s:form action="buscaXprecio" id="idForm" >
	Precio Inicial<s:textfield name="precio1"
				 />
	Precio Final<s:textfield name="precio2" 
				 />
	<sj:submit  button="true" value="enviar" targets="divRespuesta"/>
	<br>
</s:form>
<div id="divRespuesta">


</div>

</body>
</html>