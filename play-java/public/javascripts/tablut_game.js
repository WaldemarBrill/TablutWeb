function myFunction() {
    document.getElementById("demo").innerHTML = "Allola";
}

function createTable() {
	for (var x = 0; x < 9; x++) {
		var Zeile = document.createElement("tr");
		Zeile.id = "Zeile" + x;
		document.getElementById("Tabelle").appendChild(Zeile);
		for (var y = 0; y < 9; y++) {
			var Zelle = document.createElement("button");
			Zelle.id = "Zelle"+x+y;
			
			Zelle.setAttribute("x", x);
			Zelle.setAttribute("y", y);
			Zelle.addEventListener("click", function(){
				alert(this.id);
			}, false);
			var inhalt = document.createTextNode("Zelle "+x+" "+y);
			Zelle.appendChild(inhalt);
			document.getElementById("Zeile"+x).appendChild(Zelle);
		}
	}
}