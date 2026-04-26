package thesis.musiikkipalvelu.web;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thesis.musiikkipalvelu.domain.Artisti;
@Controller
public class ArtistiController {
@GetMapping("/lisaaArtisteja")
public String lisaaArtisteja(Model model) {
List<Artisti> artistit = new ArrayList<Artisti>();

model.addAttribute("artistit", artistit);
return "Ostamusiikkia";
}
}