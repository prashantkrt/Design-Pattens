package structural_design_pattern.Flyweight_Cache_design_pattern.example1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketFactory {

    private static Map<String, Ticket> ticketCache = new HashMap<>();

    public static Ticket getTicket(String ticketType, String key, Date date) {
        Ticket ticket = (Ticket) ticketCache.get(ticketType);
        if (ticket == null) {
            if (ticketType.equalsIgnoreCase("MovieTicket")) {
                // movieName, ThreaterName and showTime
                ticket = new MovieTicket(key.split("_")[0], key.split("_")[1], date);
            } else if (ticketType.equalsIgnoreCase("TrainTicket")) {
                //trainName, Source and Destination
                ticket = new TrainTicket(key.split("_")[0], key.split("_")[1], key.split("_")[2], date);
            }
            ticketCache.put(ticketType, ticket);
        }
        return (Ticket) ticket;
    }
}
