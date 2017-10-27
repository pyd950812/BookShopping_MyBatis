function usercheck() {
	var patt=/.*/ig;
	var username=document.getElementById("userinput").value;
	if(patt.test(username)==true){
		var ajax=new XMLHttpRequest();
		 ajax.open("get","UserServlet?username="+username, true);
		 ajax.onreadystatechange = function (){
			 if(ajax.readyState==4 && ajax.status==200){
				var data =ajax.responseText;
				if(data=="defeat"){
					document.getElementById("userspan1").style.display="block";
					document.getElementById("userspan").style.display="none";
					}else {
					document.getElementById("userspan").style.display="block";
					document.getElementById("userspan1").style.display="none";
					}
			 }
			 if(username==""){
				 document.getElementById("userspan").style.display="none";
				 document.getElementById("userspan1").style.display="none";
			 }
		 }
		 ajax.send();
		}
}

function pwcheck() {
	var patt=/^[a-z0-9_-]{6,18}$/ig;
	var pw=document.getElementById("pwinput").value;
	if(patt.test(pw)==true){
		document.getElementById("pwspan").style.display="block";
		document.getElementById("pwspan1").style.display="none";
		
	}else{
		document.getElementById("pwspan1").style.display="block";
		document.getElementById("pwspan").style.display="none";
		}
	 if(pw==""){
		 document.getElementById("userspan").style.display="none";
		 document.getElementById("userspan1").style.display="none";
	 }
}


function zipcheck() {
	var patt=/^\d{6}$/ig;
	var zip=document.getElementById("zipinput").value;
	if(patt.test(zip)==true){
		document.getElementById("zipspan").style.display="block";
		document.getElementById("zipspan1").style.display="none";
		
	}else{
		document.getElementById("zipspan1").style.display="block";
		document.getElementById("zipspan").style.display="none";
		}
	 if(zip==""){
		 document.getElementById("zipspan").style.display="none";
		 document.getElementById("zipspan1").style.display="none";
	 }
	
}

function addrecheck() {
	
	var addre=document.getElementById("addreinput").value;
	if(true){
		document.getElementById("addrespan").style.display="block";
		document.getElementById("addrespan1").style.display="none";
	}
	
}
function phonecheck() {
	var patt=/^\d{11}$/;
	var phone=document.getElementById("phoneinput").value;
	if(patt.test(phone)==true){
		document.getElementById("phonespan").style.display="block";
		document.getElementById("phonespan1").style.display="none";
		
	}else{
		document.getElementById("phonespan1").style.display="block";
		document.getElementById("phonespan").style.display="none";
		}
	 if(phone==""){
		 document.getElementById("phonespan").style.display="none";
		 document.getElementById("phonespan1").style.display="none";
	 }
	
}

function emailcheck() {
	var patt=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/ig;
	var email=document.getElementById("emailinput").value;
	if(patt.test(email)==true){
		document.getElementById("emailspan").style.display="block";
		document.getElementById("emailspan1").style.display="none";
		
	}else{
		document.getElementById("emailspan1").style.display="block";
		document.getElementById("emailspan").style.display="none";
		}
	 if(email==""){
		 document.getElementById("emailspan").style.display="none";
		 document.getElementById("emailspan1").style.display="none";
	 }
	
}







