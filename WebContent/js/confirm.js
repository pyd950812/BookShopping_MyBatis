function submitOrder() {	
	var allprice=document.getElementById("font1").innerHTML;
	alert("aaaaaaaaaaaaaaaaaaaaaaa");
	var ajax=new XMLHttpRequest();
	ajax.open("get", "OrderServlet?allprice="+allprice+"", false);
	ajax.onreadystatechange=function(){
		if(ajax.readyState==4&&ajax.status==200){
			var date=ajax.responseText;
			alert(allprice);
		}
	}
	ajax.send();
	return true;
}