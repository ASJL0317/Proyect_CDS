<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Producto por Categoria</title>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>

<h1>Producto por Categoria</h1>

<s:form action="buscaProducto" id="idProd" >
	
	Categoria
	<s:select 
	name="categoria"
	headerKey=""
	headerValue="[Seleccione]"
	list="#{'Oficina':'Oficina','Informatica':'Informatica'}"></s:select>
	
	<sj:submit button="true" value="Enviar" targets="divRespuesta">
	</sj:submit>
	
</s:form>

<div id="divRespuesta" ></div>

</body>
</html>