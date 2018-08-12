<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
<div class="container">
	<div class="panel-body">
		<div>
			<button type="button" data-toggle="modal"
				data-target="#todo_add_modal">할일추가</button>
		</div>
		<div class="pull-right">
			<div class="btn-group">
				<button type="button" class="btn btn-success btn-filter"
					data-target="pagado">Pagado</button>
				<button type="button" class="btn btn-warning btn-filter"
					data-target="pendiente">Pendiente</button>
				<button type="button" class="btn btn-danger btn-filter"
					data-target="cancelado">Cancelado</button>
				<button type="button" class="btn btn-default btn-filter"
					data-target="all">Todos</button>
			</div>
		</div>
		<div class="table-container">
			<table class="table table-filter">
				<tbody>
					<c:forEach var="my" items="${todolist}" varStatus="status">
						<tr data-status="pagado">
							<td>
								<div class="ckbox">
									<input type="checkbox" id="checkbox1"> <label
										for="checkbox1"></label>
								</div>
							</td>
							<td><a href="javascript:;" class="star"> <i
									class="glyphicon glyphicon-star"></i>
							</a></td>
							<td>
								<div class="media">
									<a href="#" class="pull-left"> <img
										src="https://s3.amazonaws.com/uifaces/faces/twitter/fffabs/128.jpg"
										class="media-photo">
									</a>
									<div class="media-body">
										<span class="media-meta pull-right">Febrero 13, 2016</span>
										<h4 class="title">
											${my.title} <span class="pull-right pagado">(Pagado)</span>
										</h4>
										<p class="summary">${my.content}</p>
									</div>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="content-footer">
		<%@include file="todoAddInputForm.jsp"%>
	</div>
</div>
