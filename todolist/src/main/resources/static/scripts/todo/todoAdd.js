$(document).ready(function () {

	$('.star').on('click', function () {
      $(this).toggleClass('star-checked');
    });

    $('.ckbox label').on('click', function () {
      $(this).parents('tr').toggleClass('selected');
    });

    $('.btn-filter').on('click', function () {
      var $target = $(this).data('target');
      if ($target != 'all') {
        $('.table tr').css('display', 'none');
        $('.table tr[data-status="' + $target + '"]').fadeIn('slow');
      } else {
        $('.table tr').css('display', 'none').fadeIn('slow');
      }
    });
    
    var todolistLength = 1;
    
    $('#save_todo').on('click',function(){
    	var newRow = $('#todo_template').clone();
    	newRow.prop('id','todo'+todolistLength++);
    	newRow.appendTo($('#todo_tbody'));
    	newRow.show();
    });
    
    $('#add_todo').on('click', function showShareAvailableUsers(){
    	$.ajax({
    		type : 'get',
    		url : '/user/searchUsers',
    		success : function(result) {
    			console.log(result)
    			var shareUserId = "";
    			var userListId = 1;
    			for(var i = 0; i<result.length; i++){
    				shareUserId += "<div id="+userListId+">"+"<input type=\"checkbox\" name=\"shareUsers\" value=\""+result[i].userSeq+"\" class=\"checkSelected\">"
    				+"ID "+result[i].id+"   이름 "+result[i].name+"</div>"+"</br>";
    				userListId++;
    				console.log(shareUserId);
    			}
    			$('#share_list').html(shareUserId);
 
    		},
    		error : function(xhr, status, error) {
    			console.log(xhr)
    			alert(status);
    		}
    	})
    });
  
    $('.row-remove').on('click', function(){
    	console.log('in');
    	$(this).closest("tr").remove();
    });
 });