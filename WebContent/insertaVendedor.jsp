<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Vendedor</title>
<sj:head jqueryui="true" jquerytheme="blitzer" locale="es"/>
</head>
<body>
  
<s:form action="registraVendedor">
	Nombre<sj:textfield name="vendedor.strNombre"  /><br>
	Apellido<sj:textfield name="vendedor.strApellido"  /><br>
	Edad<sj:textfield name="vendedor.intEdad"  /><br>
	Fec. Nacimiento
	<sj:datepicker value="today" name="vendedor.strFecha" displayFormat="yy-mm-dd" /><br>
	Estado<s:select name="vendedor.strEstado" 
	             headerKey=" "
	             headerValue="[Seleccione Estado civil]"
				 list="#{'Soltero':'Soltero',
							'Casado':'Casado',
							'Divorciado':'Divorciado',
							'Viudo':'Viudo' }" /><br>
	
	Distrito <s:select name="vendedor.strDistrito" 
	                headerKey=" "
	                headerValue="[Seleccione Distrito]"
					list="#{'Lince':'Lince',
							'SJL':'SJL',
							'Los olivos':'Los olivos',
							'Independencia':'Independencia' }" /><br>
	<br>
	<sj:submit button="true" value="enviar" />
</s:form>

</body>



</html>