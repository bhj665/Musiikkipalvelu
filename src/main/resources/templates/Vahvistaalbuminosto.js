function vahvistaAlbuminOsto() {
var albuminid = document.getElementById("albumiid").value;
var albuminalbuminnimi = document.getElementById("albumialbuminnimi").value;
var albuminvuosi = document.getElementById("albumivuosi").value;
var albuminkesto = document.getElementById("albumikesto").value;
var albuminhinta = document.getElementById("albumihinta").value;
var albuminartisti = document.getElementById("albumiartisti").value;
document.getElementById("albuminid").innerHTML = albuminid;
document.getElementById("albuminalbuminnimi").innerHTML = albuminalbuminnimi;
document.getElementById("albuminvuosi").innerHTML = albuminvuosi;
document.getElementById("albuminkesto").innerHTML = albuminkesto;
document.getElementById("albuminhinta").innerHTML = albuminhinta;
document.getElementById("albuminartisti").innerHTML = albuminartisti;
}