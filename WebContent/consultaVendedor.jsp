<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendedores x Estado Civil</title>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>
<h1>Vendedores por estado Civil</h1>
<s:form action="buscaXEstado" id="idForm" >
	Estado Civil<s:select name="vendedor.strEstado" 
	             headerKey=" "
	             headerValue="[Seleccione Estado civil]"
				 list="#{'Soltero':'Soltero',
						'Casado':'Casado',
						'Divorciado':'Divorciado',
						'Viudo':'Viudo' }" />
	<sj:submit  button="true" value="enviar" targets="divRespuesta"/>
</s:form>
<div id="divRespuesta">


</div>

</body>
</html>