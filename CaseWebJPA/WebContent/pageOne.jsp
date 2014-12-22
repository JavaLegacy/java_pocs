<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:a4j="http://richfaces.org/a4j"
	xmlns:rich="http://richfaces.org/rich">
<body>
	<ui:composition template="/template.jsp">
		<ui:define name="title">
			<h:outputText value="Here is the title" />
		</ui:define>

		<ui:define name="body">
			<h:panelGroup style="margin: 50px;margin-bottom: 50px;border: 50px">
			
			<h:form>
				<h:panelGrid columns="4" border="2">

					<f:facet name="header">
						<h:outputText value="Fill Form" />
					</f:facet>

					<h:outputLabel value="name" />
					<h:inputText label="name" />

					<h:outputLabel value="Gender" />
					<h:selectOneMenu id="persongender">
						<f:selectItem itemValue="first" itemLabel="first" />
						<f:selectItem itemValue="second" itemLabel="second" />
					</h:selectOneMenu>

					<h:outputLabel value="BirthDate" />
					<h:inputText label="name" />

					<h:outputLabel value="CompanyId" />
					<h:selectOneMenu id="companyId" value="#{StaffMB.companyStaff}">
						<f:selectItems id="items" value="#{StaffMB.selectItems}" />
					</h:selectOneMenu>
					<h:commandButton value="Save" />

				</h:panelGrid>
			</h:form>
			
			</h:panelGroup>
			
			
			
			<h:dataTable border="2">
				<h:column>
					<f:facet name="header">name</f:facet>
				</h:column>
				<h:column>
					<f:facet name="header">gender</f:facet>
				</h:column>
				<h:column>
					<f:facet name="header">birthdate</f:facet>
				</h:column>
				<h:column>
					<f:facet name="header">companyId</f:facet>
				</h:column>
			</h:dataTable>

		</ui:define>
	</ui:composition>
</body>
</html>