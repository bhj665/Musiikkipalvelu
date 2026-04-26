function ostaKappale() {
var saldo = document.getElementById("saldo").value;
saldo = saldo - 0.99;
document.getElementById("saldo").innerHTML = saldo;
var kappaleenid = document.getElementById("kappaleenid").value;
var kappaleennimi = document.getElementById("kappaleennimi").value;
var kappaleenvuosi = document.getElementById("kappaleenvuosi").value;
var kappaleenkesto = document.getElementById("kappaleenkesto").value;
var kappaleenartisti = document.getElementById("kappaleenartisti").value;
var kappaleenalbumi = document.getElementById("kappaleenalbumi").value;
document.getElementById("kappaletiedot").innerHTML = kappaleenid + "<br>" + kappaleennimi + "<br>" + kappaleenvuosi + "<br>" + kappaleenkesto + "<br>" + kappaleenartisti + "<br>" + kappaleenalbumi + "<br>";
}