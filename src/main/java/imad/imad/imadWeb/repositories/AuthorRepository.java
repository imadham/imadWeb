package imad.imad.imadWeb.repositories;

        import imad.imad.imadWeb.model.Author;
        import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
