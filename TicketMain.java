
public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket[] tickets = {new WalkupTicket(1, 0), new AdvanceTicket(1, 6),
								 new StudentAdvancedTicket(1, 6)};
		for(int i=0; i<tickets.length; i++) {
			System.out.println(tickets[i].getClass() + "\n" + tickets[i]);
			System.out.println(tickets[i].getPrice());
		}
			
		
	}

}
