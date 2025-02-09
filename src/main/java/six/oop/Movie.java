package six.oop;

public class Movie {
    private String director;
    private int rating;
    private String title;

    public Movie(String naslov, String reziser){
        this.director = reziser;
        this.title = naslov;
    }

    public void setRating(int ocjena) {
        if (ocjena >= 10) {
            this.rating = 10;
        } else if (ocjena <= 0) {
            this.rating = 0;
        } else {
            this.rating = ocjena;
        }
    }

    public int getRating() {
        return rating;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return  "Naslov: " + this.title + " - Režiser: " + this.director + " - Rating: " + this.rating;
    }
}
