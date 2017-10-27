// JavaScript Document
function check1(x){
	for(var i=1;i<4;i++){
		if(i==x){
			document.getElementById("edition"+i).style.backgroundColor="red";
			}else{
			document.getElementById("edition"+i).style.backgroundColor="#fff";
				}
			}
	}

function addToCar() {
	var num=document.getElementById("id1").value;
	var hrefline=document.getElementById("addCar").href;
	hrefline+="&num="+num;
	document.getElementById("addCar").href=hrefline;
	
}

function toLogin(){
	alert("you are not logined,please to login !");
}

function userinfo(){
	alert("you are not logined,please to login !");
}