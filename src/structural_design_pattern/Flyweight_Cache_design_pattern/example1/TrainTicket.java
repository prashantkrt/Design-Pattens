package structural_design_pattern.Flyweight_Cache_design_pattern.example1;

import java.util.Date;

public class TrainTicket implements Ticket{
    private String trainName;
    private String source;
    private String destination;
    private Date travelDate;
    private String seatNumber;

    public TrainTicket(String trainName, String source, String destination, Date travelDate) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.travelDate = travelDate;
    }

    public void bookTicket(String seatNumber) {
        this.seatNumber = seatNumber;
        System.out.println("Train ticket booked for " + this.travelDate + " on Train " + this.trainName + " from " + this.source + " to " + this.destination + " with seat number " + seatNumber);
    }

    public String getTicketInfo() {
        return "Train ticket booked for " + this.travelDate + " on Train " + this.trainName + " from " + this.source + " to " + this.destination + " with seat number " + this.seatNumber;
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "trainName='" + trainName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", travelDate=" + travelDate +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
