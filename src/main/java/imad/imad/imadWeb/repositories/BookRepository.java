package imad.imad.imadWeb.repositories;

import imad.imad.imadWeb.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
