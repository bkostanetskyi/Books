package mate.academy.books.service;

import java.util.List;
import mate.academy.books.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
