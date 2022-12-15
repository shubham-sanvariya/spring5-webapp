package ronit.springframework.springSwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ronit.springframework.springSwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
