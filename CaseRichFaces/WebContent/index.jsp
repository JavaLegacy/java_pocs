<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<html>
<head>
<title>RichFaces Greeter</title>
</head>
<body>
	<f:view>
		<a4j:form>
					<rich:panel header="RichFaces Greeter" style="width: 315px">
				<h:outputText value="Your name: " />
				<h:inputText value="#{user.name}">
					<f:validateLength minimum="1" maximum="30" />
				</h:inputText>
				<a4j:commandButton value="Get greeting" reRender="greeting" />
				<h:panelGroup id="greeting">
					<h:outputText value="Hello, " rendered="#{not empty user.name}" />
					<h:outputText value="#{user.name}" />
					<h:outputText value="!" rendered="#{not empty user.name}" />
				</h:panelGroup>
			</rich:panel>
		</a4j:form>
	</f:view>

</body>
</html>