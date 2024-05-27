<%@page%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="http://acme-framework.org/"%>

<acme:list>
	<acme:list-column code="client.progress-log.list.label.recordId" path="recordId" width="40%"/>
	<acme:list-column code="client.progress-log.list.label.completeness" path="completeness" width="20%"/>
	<acme:list-column code="client.progress-log.list.label.contract" path="contract" width="20%"/>		
			
</acme:list>


<acme:button code="client.list.label.create" action="/client/progress-log/create"/>