function haku() {
var kappalenimi = document.getElementById("kappalenimi").value;
var kappaleartisti = document.getElementById("kappaleartisti").value;
var kappalealbumi = document.getElementById("kappalealbumi").value;
var albumialbuminnimi = document.getElementById("albumialbuminnimi").value;
var albumiartisti = document.getElementById("albumiartisti").value;
var arvo = document.getElementById("arvo").value;
if (arvo != kappalenimi && arvo != kappaleartisti && arvo != kappalealbumi) {
document.getElementById("kappaleid").innerHTML = "";
document.getElementById("kappalenimi").innerHTML = "";
document.getElementById("kappalevuosi").innerHTML = "";
document.getElementById("kappalekesto").innerHTML = "";
document.getElementById("kappaleartisti").innerHTML = "";
document.getElementById("kappalealbumi").innerHTML = "";
document.getElementById("kappaleosto").innerHTML = "";
}
if (arvo != albumialbuminnimi && arvo != albumiartisti) {
document.getElementById("albumituotekoodi").innerHTML = "";
document.getElementById("albumialbuminnimi").innerHTML = "";
document.getElementById("albumivuosi").innerHTML = "";
document.getElementById("albumikesto").innerHTML = "";
document.getElementById("albumihinta").innerHTML = "";
document.getElementById("albumiartisti").innerHTML = "";
document.getElementById("albumiosto").innerHTML = "";
}
}