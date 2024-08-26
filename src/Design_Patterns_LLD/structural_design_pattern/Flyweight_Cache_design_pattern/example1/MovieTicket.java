package Design_Patterns_LLD.structural_design_pattern.Flyweight_Cache_design_pattern.example1;

import java.util.Date;

public class MovieTicket implements Ticket {
    private String movieName;
    private String theaterName;
    private Date showTime;
    private String seatNumber;

    public MovieTicket(String movieName, String theaterName, Date showTime) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.showTime = showTime;
    }

    public void bookTicket(String str) {
        this.seatNumber = str;
        System.out.println("Movie ticket booked for " + this.showTime + " for movie " + this.movieName + " at " + this.theaterName + " with seat number " + this.seatNumber);
    }

    public String getTicketInfo() {
        return "Movie ticket booked for " + this.showTime + " for movie " + this.movieName + " at " + this.theaterName + " with seat number " + this.seatNumber;
    }


    @Override
    public String toString() {
        return "MovieTicket{" +
                "movieName='" + movieName + '\'' +
                ", theaterName='" + theaterName + '\'' +
                ", showTime=" + showTime +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
