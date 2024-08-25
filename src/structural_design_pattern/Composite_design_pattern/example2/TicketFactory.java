package structural_design_pattern.Composite_design_pattern.example2;

import java.util.HashMap;
import java.util.Map;

public class TicketFactory {

    private Map<String, Ticket> tickets = new HashMap<>();

    TicketFactory() {
    }

    public Ticket getTicket(String movieName, String theater, double price) {
        String key = movieName + theater;
        Ticket ticket = (Ticket)this.tickets.get(key);
        if (ticket == null) {
            ticket = new MovieTicket(movieName, theater, price);
            this.tickets.put(key, ticket);
        }
        return (Ticket)ticket;
    }
}
