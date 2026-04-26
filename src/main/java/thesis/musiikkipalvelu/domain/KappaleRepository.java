package thesis.musiikkipalvelu.domain;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface KappaleRepository extends CrudRepository<Kappale, String> {
List<Kappale> findByNimi(String nimi);
}