<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<c:forEach var="my" items="${todolist}" varStatus="status">
		    	<div class="col-xs-8">
			    	<h4 class="panel-title">
						${my.title}
					</h4>
				</div>
	</c:forEach>
	</div>