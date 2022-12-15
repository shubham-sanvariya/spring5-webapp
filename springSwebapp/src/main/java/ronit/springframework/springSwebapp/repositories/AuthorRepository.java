package ronit.springframework.springSwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ronit.springframework.springSwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
