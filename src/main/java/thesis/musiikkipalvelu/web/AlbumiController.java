package thesis.musiikkipalvelu.web;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import thesis.musiikkipalvelu.domain.Albumi;
@Controller
public class AlbumiController {
@GetMapping("/lisaaalbumeita")
public String lisaaAlbumeita(Model model) {
List<Albumi> albumit = new ArrayList<Albumi>();

model.addAttribute("albumit", albumit);
return "Ostamusiikkia";
}
}