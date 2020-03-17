package home.workweeksix.controller;

import home.workweeksix.model.Movie;
import home.workweeksix.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import static home.workweeksix.utils.WebAppProp.*;


@Controller
public class WebApp {

  private final MovieService service;

  @Autowired
  public WebApp(MovieService service) {
    this.service = service;
  }

  @GetMapping(URL_ALL)
  public String getAllMovies(Model model) {
    model.addAttribute(VALUE, service.getAllMovies());
    return ALL_VIEW;
  }

  @GetMapping(URL_ADD)
  public String greetingForm(Model model) {
    model.addAttribute(MODEL, new Movie());
    return ADD_VIEW;
  }

  @PostMapping(URL_ADD)
  public String greetingSubmit(@ModelAttribute Movie movie) {
    service.addMovie(movie);
    return REDIRECT;
  }


}
