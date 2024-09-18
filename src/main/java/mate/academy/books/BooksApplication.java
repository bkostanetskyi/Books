package mate.academy.books;

import java.math.BigDecimal;
import java.util.List;
import mate.academy.books.model.Book;
import mate.academy.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooksApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("Effective Java");
            book.setAuthor("Joshua Bloch");
            book.setIsbn("978-0134685991");
            book.setPrice(new BigDecimal("45.00"));
            book.setDescription("A comprehensive guide to best practices in Java programming.");
            book.setCoverImage("effective_java_cover.jpg");

            bookService.save(book);

            List<Book> books = bookService.findAll();
        };
    }
}
