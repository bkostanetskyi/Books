package mate.academy.books.mapper;

import mate.academy.books.confing.MapperConfig;
import mate.academy.books.dto.BookDto;
import mate.academy.books.dto.CreateBookRequestDto;
import mate.academy.books.model.Book;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateModelFromDto(CreateBookRequestDto requestDto, @MappingTarget Book book);
}
