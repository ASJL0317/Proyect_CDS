<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>


<s:url id="idData" action="listaDataSede"/>
<sjg:grid id="idGrid"
		  gridModel="lstSede"
		  href="%{idData}"
		  rowNum="4"
		  width="300"
		  dataType="json"
		  pager="true">

	<sjg:gridColumn name="codSede" title="Id"/>
	<sjg:gridColumn name="nomSede" title="Nombre"/>
	<sjg:gridColumn name="dirSede" title="Direccion"/>
	<sjg:gridColumn name="fechaSede" title="Fecha"/>

</sjg:grid>