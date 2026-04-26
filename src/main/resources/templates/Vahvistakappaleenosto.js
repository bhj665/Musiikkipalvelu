function vahvistaKappaleenOsto() {
var kappaleenid = document.getElementById("kappaleid").value;
var kappaleennimi = document.getElementById("kappalenimi").value;
var kappaleenvuosi = document.getElementById("kappalevuosi").value;
var kappaleenkesto = document.getElementById("kappalekesto").value;
var kappaleenartisti = document.getElementById("kappaleartisti").value;
var kappaleenalbumi = document.getElementById("kappalealbumi").value;
document.getElementById("kappaleenid").innerHTML = kappaleenid;
document.getElementById("kappaleennimi").innerHTML = kappaleennimi;
document.getElementById("kappaleenvuosi").innerHTML = kappaleenvuosi;
document.getElementById("kappaleenkesto").innerHTML = kappaleenkesto;
document.getElementById("kappaleenartisti").innerHTML = kappaleenartisti;
document.getElementById("kappaleenalbumi").innerHTML = kappaleenalbumi;
}