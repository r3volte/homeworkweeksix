package home.workweeksix.model;

public class Movie {

  private String tittle;
  private String filmProducer;
  private Integer yearOfProduction;

  public Movie() {
  }

  public Movie(String tittle, String filmProducer, Integer yearOfProduction) {
    this.tittle = tittle;
    this.filmProducer = filmProducer;
    this.yearOfProduction = yearOfProduction;
  }

  public String getTittle() {
    return tittle;
  }

  public void setTittle(String tittle) {
    this.tittle = tittle;
  }

  public String getFilmProducer() {
    return filmProducer;
  }

  public void setFilmProducer(String filmProducer) {
    this.filmProducer = filmProducer;
  }

  public Integer getYearOfProduction() {
    return yearOfProduction;
  }

  public void setYearOfProduction(Integer yearOfProduction) {
    this.yearOfProduction = yearOfProduction;
  }
}
