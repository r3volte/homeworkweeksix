package home.workweeksix.service;

import home.workweeksix.model.Movie;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

  private List<Movie> movies;

  public MovieService() {
    this.movies = new ArrayList<>();
  }

  public List<Movie> getAllMovies() {
    return movies;
  }

  @MailInit
  public void addMovie(Movie movie) {
    movies.add(movie);
  }


  @EventListener(ApplicationReadyEvent.class)
  public void fillList() {
    addMovie(new Movie("Parasite", "Joon-ho Bong", 2019));
    addMovie(new Movie("Contagion ", "Steven Soderbergh", 2011));
    addMovie(new Movie("Zaginione dziewczyny", "Liz Garbus", 2020));
    addMovie(new Movie("Boze Cialo", "Jan Komasa", 2019));
    addMovie(new Movie("Prestiz", "Christopher Nolan", 2006));
    addMovie(new Movie("Forest Gump", "Robert Zemeckis", 1994));
    addMovie(new Movie("Stalker", "Andriej Tarkowski", 1979));
    addMovie(new Movie("Buntownik z Wyboru", "Gus Van Sant", 1997));
  }
}
