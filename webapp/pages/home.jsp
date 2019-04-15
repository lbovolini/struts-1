<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<div>
    <h1><bean:write name="homeForm" property="name"/></h1>
    <span>Home page</span>

    <bean:message key="label.user.name"/>
</div>