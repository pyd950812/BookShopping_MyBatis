function add(){
	var num=document.getElementById("id1").value;
	num++;
	document.getElementById("id1").value=num;
}

function subtract() {
	var num=document.getElementById("id1").value;
	
	if(num>1){
		num--;
		document.getElementById("id1").value=num;
	}
}

function check(x) {
	for(var i=1;i<3;i++){
		if(i!=x){
				document.getElementById("check"+i).style.borderTopWidth="0px";
				document.getElementById("text"+i).style.display="none";
		}else {
				document.getElementById("check"+i).style.borderTopWidth="2px";
				document.getElementById("text"+i).style.display="block";
		}
	}
}
