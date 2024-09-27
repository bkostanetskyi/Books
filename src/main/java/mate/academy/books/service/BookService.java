package mate.academy.books.service;

import java.util.List;
import mate.academy.books.dto.BookDto;
import mate.academy.books.dto.CreateBookRequestDto;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll(Pageable pageable);

    BookDto findById(long id);

    void deleteById(long id);

    BookDto updateById(long id, CreateBookRequestDto requestDto);
}
