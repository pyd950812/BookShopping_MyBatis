function checkprice(x){
	var i=x;
	var price=document.getElementById("checkprice"+i).innerHTML;
	     document.getElementById("pricespan").innerHTML=price; 
	var ajax=new XMLHttpRequest();
	ajax.open("get","AjaxProductServlet?price_id="+i, true);
	ajax.onreadystatechange=function(){
		if(ajax.readyState==4 && ajax.status==200){
			var data=ajax.responseText;
			document.getElementById("ajaxdiv").innerHTML=data;
		}
	}
	ajax.send(); 
	}

function checkpublish(x){
	var publish=document.getElementById("publiccheck"+x).innerHTML;
	     document.getElementById("publishspan").innerHTML=publish;
	}