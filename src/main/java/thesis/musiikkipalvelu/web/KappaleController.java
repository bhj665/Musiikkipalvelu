package thesis.musiikkipalvelu.web;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thesis.musiikkipalvelu.domain.Kappale;
@Controller
public class KappaleController {
@GetMapping("/lisaakappaleita")
public String lisaaKappaleita(Model model) {
List<Kappale> kappaleet = new ArrayList<Kappale>();

model.addAttribute("kappaleet", kappaleet);
return "Ostamusiikkia";
}
@GetMapping("/lisaasuosituksia")
public String lisaaSuosituksia(Model model) {
List<Kappale> suositukset = new ArrayList<Kappale>();

model.addAttribute("suositukset", suositukset);
return "Etusivu";
}
@GetMapping("/lisaaviimeksikuunneltuja")
public String lisaaViimeksiKuunneltuja(Model model) {
List<Kappale> viimeksikuunnellut = new ArrayList<Kappale>();

model.addAttribute("viimeksikuunnellut", viimeksikuunnellut);
return "Etusivu";
}
}