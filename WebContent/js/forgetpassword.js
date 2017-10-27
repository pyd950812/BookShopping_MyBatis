function getCode(){
	var Number=[1,2,3,4,5,6,7,8,9,0,'a','b','c','d','e','f'];
	var code=new Array();
	for(var i=0;i<=3;i++){
		var a=Math.round(Math.random()*15);
		code[i]=Number[a];
	}
	var num=code[0]+""+code[1]+""+code[2]+""+code[3];
	document.getElementById("get").style.display="none";
	document.getElementById("randomNum").innerHTML=num;
} 

function check(){
	var code=document.getElementById("shape").value.toLowerCase();
	var randomnum=document.getElementById("randomNum").innerHTML.toLowerCase();
	if(code!=randomnum){
		getCode();
		return false;
		}
	return true;
	
	}