<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/css/add.css">    
<script src="/scripts/add.js"></script>
<div class="container">
<div class="col-md-5">
    <div class="form-area">  
        <form id="todo_input_form" method="POST" action="/todolist/add" onsubmit="return addCheck()">
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">Contact Form</h3>
    				<div class="form-group">
						<input type="text" class="form-control" id="title" name="title" placeholder="title" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="content" name="content" placeholder="content" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="start_date" name="start_date" placeholder="start_date" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="end_date" name="end_date" placeholder="end_date" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="end_date" name="important" placeholder="important" required>
					</div>
                    <div class="form-group">
                    <textarea class="form-control" type="textarea" id="message" placeholder="Message" maxlength="140" rows="7"></textarea>
                        <span class="help-block"><p id="characterLeft" class="help-block ">You have reached the limit</p></span>                    
                    </div>
            
        <button type="submit" name="submit" class="btn btn-primary pull-right">Submit Form</button>
        </form>
    </div>
</div>
</div>