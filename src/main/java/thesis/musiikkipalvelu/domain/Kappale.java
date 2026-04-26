package thesis.musiikkipalvelu.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Kappale {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String nimi;
private int vuosi;
private String kesto;
@ManyToOne
@JoinColumn(name = "nimi")
@JoinColumn(name = "albuminnimi")
@JsonIgnoreProperties("kappale")
private Artisti artisti;
private Albumi albumi;
public Kappale(int id, String nimi, int vuosi, String kesto, Artisti artisti, Albumi albumi) {
this.id = id;
this.nimi = nimi;
this.vuosi = vuosi;
this.kesto = kesto;
this.artisti = artisti;
this.albumi = albumi;
}
public Kappale() {
this.id = 0;
this.nimi = null;
this.vuosi = 0;
this.kesto = null;
this.artisti = null;
this.albumi = null;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getNimi() {
return nimi;
}
public void setNimi(String nimi) {
this.nimi = nimi;
}
public int getVuosi() {
return vuosi;
}
public void setVuosi(int vuosi) {
this.vuosi = vuosi;
}
public String getKesto() {
return kesto;
}
public void setKesto(String kesto) {
this.kesto = kesto;
}
public Artisti getArtisti() {
return artisti;
}
public void setArtisti(Artisti artisti) {
this.artisti = artisti;
}
public Albumi getAlbumi() {
return albumi;
}
public void setAlbumi(Albumi albumi) {
this.albumi = albumi;
}
@Override
public String toString() {
return this.id + this.nimi + this.vuosi + this.kesto + this.artisti + this.albumi;
}
}