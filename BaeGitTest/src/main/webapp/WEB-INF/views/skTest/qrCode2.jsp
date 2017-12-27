<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){ 
	  $('#createBtn').click(function(){

				
			var id1 = $('#id1').val();
			id1 = encodeURIComponent(id1);		
	  		
			var url = "https://section.cafe.naver.com/CombinationSearch.nhn?query=";
				  
		    googleQRUrl = "https://chart.googleapis.com/chart?chs=177x177&cht=qr&chl="+url+id1;

		    $('#qrcode').attr('src', googleQRUrl);

		   });
});

</script>



<body> 
	
	<h2>QR-CODE google API</h2>
    
    <input type="text" id="id1" placeholder="value"/>
    
	<div>
		<button id="createBtn">create</button>
	</div>

    <div>
		<img id="qrcode" src='' />
	</div>



    

</body>
</html> 