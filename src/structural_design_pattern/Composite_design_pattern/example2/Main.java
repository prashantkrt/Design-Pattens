package structural_design_pattern.Composite_design_pattern.example2;

//Ticketing system
public class Main {
    public static void main(String[] args) {
        TicketFactory ticketFactory = new TicketFactory();

        Ticket ticket1 = ticketFactory.getTicket("Avengers: Endgame", "Regal Cinemas", 12.5);
        ticket1.sell();

        Ticket ticket2 = ticketFactory.getTicket("Avengers: Endgame", "AMC Theatres", 13.5);
        ticket2.sell();

        Ticket ticket3 = ticketFactory.getTicket("Joker", "Regal Cinemas", 11.5);
        ticket3.sell();

        Ticket ticket4 = ticketFactory.getTicket("Joker", "AMC Theatres", 12.5);
        ticket4.sell();
    }
}
