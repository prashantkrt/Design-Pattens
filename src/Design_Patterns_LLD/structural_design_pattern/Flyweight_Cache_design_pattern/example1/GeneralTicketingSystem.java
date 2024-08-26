package Design_Patterns_LLD.structural_design_pattern.Flyweight_Cache_design_pattern.example1;

import java.util.Date;

public class GeneralTicketingSystem {
    public static void main(String[] args) {
        Date showTime = new Date();
        Date travelDate = new Date();

        Ticket ticket1 = TicketFactory.getTicket("MovieTicket", "Avengers_IMAX_11am", showTime);
        ticket1.bookTicket("A3");

        Ticket ticket4 = TicketFactory.getTicket("MovieTicket", "RRR_PJPCinema_10am", showTime);
        ticket4.bookTicket("B2");

        Ticket ticket2 = TicketFactory.getTicket("TrainTicket", "RajdahniExpress_Mumbai_Delhi", travelDate);
        ticket2.bookTicket("B3");

        Ticket ticket3 = TicketFactory.getTicket("MovieTicket", "MissionImpossible_2pm", showTime);
        ticket3.bookTicket("A2");
    }
}
