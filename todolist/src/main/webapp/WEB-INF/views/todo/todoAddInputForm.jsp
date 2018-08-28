<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="modal fade" id="todo_add_modal" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Todo 추가</h4>
      </div>
      <form id="todo_add" method="POST" action="/todolist/addTodo"  onsubmit="return addCheck()">
	    <div class="modal-body">
	    	<label for="add_title", name="title">제목</label>
			<input id="add_title"class="form-control" name="title"></input>
			   		<label for="add_contents", name="content">내용</label>
			<textarea id="add_contents"class="form-control" name="content"></textarea>
			
			<label for="add_endDate">시작일</label>
			<input type="date" id="add_startDate" name="startDate"class="time_input form-control"></input>
			<label for="add_endDate">종료일</label>
			<input type="date" id="add_endDate" name="endDate"class="time_input form-control"></input>
			<!--  <input type="time" id="add_endTime" class="set_margin_after time_input form-control" placeholder="hh:mm"></input>-->
			<!-- <input type="hidden" id="add_endDateTime" name="endDate"> -->
		</div>
		<div id="todo_tag">
			태그달기
		</div>
		<div id="todo_share">
			공유추가
			<div id="share_list" name="shareUsers"></div>
		</div>
		<div class="modal-footer">	
 	 	  	<button type="reset" class="btn btn-default" data-dismiss="modal">취소</button>
	        <button type="submit" class="save_todo" id="save_todo">저장</button>
    	</div>
	    </form>
    </div>
  </div>
</div>