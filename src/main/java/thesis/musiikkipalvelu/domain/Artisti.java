package thesis.musiikkipalvelu.domain;
public class Artisti {
private int id;
private String nimi;
private String kansalaisuus;
private int syntymavuosi;
public Artisti(int id, String nimi, String kansalaisuus, int syntymavuosi) {
this.id = id;
this.nimi = nimi;
this.kansalaisuus = kansalaisuus;
this.syntymavuosi = syntymavuosi;
}
public Artisti() {
this.id = 0;
this.nimi = null;
this.kansalaisuus = null;
this.syntymavuosi = 0;
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
public String getKansalaisuus() {
return kansalaisuus;
}
public void setKansalaisuus(String kansalaisuus) {
this.kansalaisuus = kansalaisuus;
}
public int getSyntymavuosi() {
return syntymavuosi;
}
public void setSyntymavuosi(int syntymavuosi) {
this.syntymavuosi = syntymavuosi;
}
@Override
public String toString() {
return this.id + this.nimi + this.kansalaisuus + this.syntymavuosi;
}
}