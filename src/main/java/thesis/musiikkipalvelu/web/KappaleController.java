package thesis.musiikkipalvelu.web;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import thesis.musiikkipalvelu.domain.Kappale;
@Controller
public class KappaleController {
@GetMapping("/lisaakappaleita")
public String lisaaKappaleita(Model model) {
List<Kappale> kappaleet = new ArrayList<Kappale>();

model.addAttribute("kappaleet", kappaleet);
return "Ostamusiikkia";
}
@PostMapping("/lisaakappalekirjastoon")
public String lisaaKappaleKirjastoon(@ModelAttribute Kappale kappale, Model model) {
model.addAttribute("kappale", kappale);
return "Kirjasto";
}
}