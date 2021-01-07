 /*<![CDATA[*/
	    
 
 const phts = document.getElementById('phts');

listPics.forEach(picDisp);

 function picDisp(pic){
	phts.style.backgroundImage = "url('/image/display/'+ pic.spicid)";
}
 /*]]>*/