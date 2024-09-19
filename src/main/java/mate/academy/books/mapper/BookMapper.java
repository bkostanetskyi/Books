package mate.academy.books.mapper;

import mate.academy.books.confing.MapperConfig;
import mate.academy.books.dto.BookDto;
import mate.academy.books.dto.CreateBookRequestDto;
import mate.academy.books.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
