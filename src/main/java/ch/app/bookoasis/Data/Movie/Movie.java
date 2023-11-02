package ch.app.bookoasis.Data.Movie;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Movie")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private List<String> genre;
    @NotNull
    private String director;
    @NotNull
    private List<String> actors;
    @NotNull
    private String releaseDate;
    @NotNull
    private String duration;
    @NotNull
    private String rating;
}
