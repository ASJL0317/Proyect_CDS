<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sede por Distrito</title>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>
<h1>Sede por DISTRITO:</h1>
<s:form action="buscaXdistrito" id="idForm" >
	Distrito<s:select name="sede.disSede" 
	             headerKey=" "
	             headerValue="[Seleccione Distrito]"
				 list="#{'Magdalena':'Magdalena',
						'Lince':'Lince',
						'Miraflores':'Miraflores',
						'San Isidro':'San Isidro',
						'Independencia':'Independencia' }" />
	<sj:submit  button="true" value="enviar" targets="divRespuesta"/>
</s:form>
<div id="divRespuesta">


</div>

</body>
</html>