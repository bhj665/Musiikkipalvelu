package thesis.musiikkipalvelu.domain;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface ArtistiRepository extends CrudRepository<Artisti, String> {
List<Artisti> findByNimi(String nimi);
}