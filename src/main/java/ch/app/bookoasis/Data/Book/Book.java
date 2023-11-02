package ch.app.bookoasis.Data.Book;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Book")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String isbn;
    @NotNull
    private String title;
    @NotNull
    private String author;
    @NotNull
    private String publisher;
    @NotNull
    private List<String> genre;
    @NotNull
    private String description;
    @NotNull
    private int pages;
    @NotNull
    private int releaseYear;
}
