package ronit.springframework.springSwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ronit.springframework.springSwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
