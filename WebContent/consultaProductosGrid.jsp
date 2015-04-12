<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>


<s:url id="idData" action="listaDataProducto"/>
<sjg:grid id="idGrid"
		  gridModel="lstProducto"
		  href="%{idData}"
		  rowNum="4"
		  width="550"
		  dataType="json"
		  pager="true">

	<sjg:gridColumn name="idCodigo" title="Id"/>
	<sjg:gridColumn name="nombre" title="Nombre"/>
	<sjg:gridColumn name="categoria" title="Categoria"/>
	<sjg:gridColumn name="fecha" title="Fecha"/>

</sjg:grid>