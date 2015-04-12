<%@ taglib uri="/struts-jquery-grid-tags"  prefix="sjg" %>
<%@ taglib uri="/struts-jquery-tags" prefix="sj" %>
<%@ taglib uri="/struts-tags" prefix="s" %>


<s:url id="idData" action="listaDataVendedor"/>
<sjg:grid id="idGridVendedor"
		  gridModel="lstVendedor"
		  href="%{idData}"
		  rowNum="4"
		  width="800"
		  dataType="json"
		  pager="true">

	<sjg:gridColumn name="intCodigo" title="Id"/>
	<sjg:gridColumn name="strNombre" title="Nombre"/>
	<sjg:gridColumn name="strApellido" title="Apellido"/>
	<sjg:gridColumn name="strEstado" title="Estado"/>

</sjg:grid>