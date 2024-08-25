package structural_design_pattern.Composite_design_pattern.example2;

public class MovieTicket  implements Ticket {
    private String movieName;
    private String theater;
    private double price;

    public MovieTicket(String movieName, String theater, double price) {
        this.movieName = movieName;
        this.theater = theater;
        this.price = price;
    }

    public void sell() {
        System.out.println("Movie Ticket for " + this.movieName + " at " + this.theater + " sold for $" + this.price);
    }
}
