$(document).ready(function() 
{
	$("#test").click(function() {
		console.log('hi submit is clicked');
	});
});



var ajaxUtils = {
    logout: function () {
        $.ajax({
            type : "GET",
            url : "logout",
            data : $.param({
                token : $('#token').val()
            }),
            success: function(data, status, xhr) {
                $('body').html(data);
            },
        });
    },
}
