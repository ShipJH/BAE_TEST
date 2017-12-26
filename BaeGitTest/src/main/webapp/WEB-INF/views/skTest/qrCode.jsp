<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>

<!-- <script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/qrcode.js"></script> 
<script type="text/javascript" src="assets/js/jquery.qrcode.js"></script>
<script type="text/javascript" src="assets/js/jquery.qrcode.min.js"></script>
 -->
  
<script type="text/javascript">
 
	function createQrcode() {
		$('#divqrcode').qrcode({
		width   : 150,
		height  : 150,
		render	: "canvas",
		text	: "http://www.naver.com",
		
		});
	}
</script>




<body> 
  <h2>QR-CODE jquery</h2>
    
	<div>
		<button id="createBtn" onclick="createQrcode()">create</button>
	</div>
    
    <div id="divqrcode">
		 
	</div>



    

</body>
</html> 