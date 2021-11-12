function yes_confirm(){
	var flag = confirm("是否确认审核通过？");
	if(flag==true){
		var x="已通过！"
		document.getElementById("yes").innerHTML=x;
		document.getElementById("button1").style.display="none";
		document.getElementById("button2").style.display="none";
	}
}	
			
function no_confirm(){
	var flag = confirm("确认审核未通过？");
	if(flag==true){
		var y="未通过！"
		document.getElementById("no").innerHTML=y;
		document.getElementById("button1").style.display="none";
		document.getElementById("button2").style.display="none";
	}
}