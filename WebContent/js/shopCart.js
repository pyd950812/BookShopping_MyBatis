function addNumber() {
	var c=document.getElementsByClassName("bb");
	var num=c.length;
	var amount=0;
	document.getElementById("titleNumber").innerHTML=num;
	document.getElementById("allNum").innerHTML=num;
	
	for(var i=0;i<c.length;i++){
		var a=document.getElementById("total"+i).innerHTML;
		 b=parseInt(a);
		 amount+=b;
		}
	document.getElementById("alltotal").innerHTML=amount;
}

function add(x) {
	var i=x;
	var num=document.getElementById("text"+i).value;
	num++;
	document.getElementById("text"+i).value=num;
	price=document.getElementById("price"+i).innerHTML;
	document.getElementById("total"+i).innerHTML=num*price;
	
	var a=document.getElementById("alltotal").innerHTML;
	var b=parseInt(a);
	var c=parseInt(price);
	var allnum=b+c;
	document.getElementById("alltotal").innerHTML=allnum;

}

function del(x) {
	var i=x;
	var num=document.getElementById("text"+i).value;
	if(num>1){
		num--;
		document.getElementById("text"+i).value=num;
		price=document.getElementById("price"+i).innerHTML;
		document.getElementById("total"+i).innerHTML=num*price;
		
		var a=document.getElementById("alltotal").innerHTML;
		var b=parseInt(a);
		var c=parseInt(price);
		var d=b-c;
		document.getElementById("alltotal").innerHTML=d;
		
	}else {
		alert("the number is error!");
	}	
}
function delet(x) {
	var i=x;
	var total=document.getElementById("total"+i).innerHTML;
	var alltotal=document.getElementById("alltotal").innerHTML-=total;
	
	var orderlineID=document.getElementById("sp"+i).innerHTML;
	var ajax=new XMLHttpRequest();
	ajax.open("get", "deleteOrderServlet?order_id="+orderlineID, false);
	ajax.onreadystatechange=function(){
		if(ajax.readyState==4 && ajax.status==200){
			var data=ajax.responseText;
			if(data=="success"){
				 alert("delete success!");
			}
		}
	}
	ajax.send();
	
	
	document.getElementById("orderline"+i).style.display="none";
	var c=document.getElementsByClassName("bb");
	var num=c.length;
	for(var i=0;i<num-1;i++){
		if(document.getElementById("orderline"+i).style.display=="none"){
			--num;
		}
	}
	document.getElementById("titleNumber").innerHTML=num;
	document.getElementById("allNum").innerHTML=num;
}

function account() {
	var c=document.getElementsByClassName("bb");
	var count=1;
	var link=document.getElementById("lin").href;
	for(var i=0;i<c.length;i++){
		var num=document.getElementById("text"+i).value;
		if(count==1){
			link+="amount="+num;
		}else {
			link+="&amount="+num;
			
		}
		count++;
	}
	
	var total=document.getElementById("alltotal").innerHTML;
	document.getElementById("lin").href=link+"&total="+total;
}

function selectAll(){
	var oInput=document.getElementsByName("cartCheckBox");
    for (var i=0;i<oInput.length;i++){
 	    oInput[i].checked=document.getElementById("allCheckBox").checked;
	}
}







