<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carga Combo Box</title>
<sj:head jqueryui="true" jquerytheme="blitzer"/>
</head>
<body>

<s:url id="idUrlVendedor" action="cargaVendedor" />
<sj:select href="%{idUrlVendedor}" 
		   list="lstVendedor" 
		   listKey="intCodigo"
		   listValue="nombreCompleto"  
		   headerKey=" " 
		   headerValue="[Seleccione]"
		   emptyOption="true"/>
<br>		   
<s:url id="idProd" action="cargaProducto"/>
<sj:select href="%{idProd}" 
		   list="lstProducto" 
		   listKey="idCodigo"
		   listValue="formato"  
		   headerKey=" " 
		   headerValue="[Seleccione Producto]"
		   emptyOption="false"/>


</body>
</html>



