package mate.academy.books.service;

import java.util.List;
import mate.academy.books.dto.BookDto;
import mate.academy.books.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(long id);
}
