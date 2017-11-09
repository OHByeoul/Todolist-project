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
    
    var todoTableLength = 0;
    
    $('.todoAddButton').on('click',function(){
    	var newRow = $('#todo_template').clone();
        newRow.prop('id','todoRow'+todoTableLength);
        newRow.appendTo($('.table-container'));
        newRow.show(); 	
    });
    
    
 });