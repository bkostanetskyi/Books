package mate.academy.books.repository;

import java.util.List;
import java.util.Optional;
import mate.academy.books.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(long id);
}
