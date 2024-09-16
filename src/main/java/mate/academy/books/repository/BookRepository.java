package mate.academy.books.repository;

import java.util.List;
import mate.academy.books.model.Book;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
