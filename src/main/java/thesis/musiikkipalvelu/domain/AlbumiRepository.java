package thesis.musiikkipalvelu.domain;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface AlbumiRepository extends CrudRepository<Albumi, String> {
List<Albumi> findByAlbuminnimi(String albuminnimi);
}