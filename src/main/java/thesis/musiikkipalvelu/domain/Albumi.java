package thesis.musiikkipalvelu.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Albumi {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int tuotekoodi;
private String albuminnimi;
private int vuosi;
private String kesto;
private double hinta;
@ManyToOne
@JoinColumn(name = "taiteilijanimi")
@JsonIgnoreProperties("albumi")
private Artisti artisti;
public Albumi(int tuotekoodi, String albuminnimi, int vuosi, String kesto, double hinta, Artisti artisti) {
this.tuotekoodi = tuotekoodi;
this.albuminnimi = albuminnimi;
this.vuosi = vuosi;
this.kesto = kesto;
this.hinta = hinta;
this.artisti = artisti;
}
public Albumi() {
this.tuotekoodi = 0;
this.albuminnimi = null;
this.vuosi = 0;
this.kesto = null;
this.hinta = 0;
this.artisti = null;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getAlbuminnimi() {
return albuminnimi;
}
public void setAlbuminnimi(String albuminnimi) {
this.albuminnimi = albuminnimi;
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
public double getHinta() {
return hinta;
}
public void setHinta(double hinta) {
this.hinta = hinta;
}
public Artisti getArtisti() {
return artisti;
}
public void setArtisti(Artisti artisti) {
this.artisti = artisti;
}
@Override
public String toString() {
return this.tuotekoodi + this.albuminnimi + this.vuosi + this.kesto + this.hinta + this.artisti;
}
}