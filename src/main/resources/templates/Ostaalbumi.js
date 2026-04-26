function ostaAlbumi() {
var saldo = document.getElementById("saldo").value;
var albumihinta = document.getElementById("albuminhinta").value;
saldo = saldo - albumihinta;
document.getElementById("saldo").innerHTML = saldo;
var albuminid = document.getElementById("albuminid").value;
var albuminalbuminnimi = document.getElementById("albuminalbuminnimi").value;
var albuminvuosi = document.getElementById("albuminvuosi").value;
var albuminkesto = document.getElementById("albuminkesto").value;
var albuminhinta = document.getElementById("albuminhinta").value;
var albuminartisti = document.getElementById("albuminartisti").value;
document.getElementById("albumitiedot").innerHTML = albuminid + "<br>" + albuminalbuminnimi + "<br>" + albuminvuosi + "<br>" + albuminkesto + "<br>" + albuminhinta + "<br>" + albuminartisti + "<br>";
}