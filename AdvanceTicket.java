
public class AdvanceTicket extends Ticket{

	public AdvanceTicket(int number, int ticketNumber) {
		super(number, ticketNumber);
		// TODO Auto-generated constructor stub
	}

	private int daysInAdvance;
	
	public void AdvancedTicket(int ticketNumber, int daysInAdvance) {
		
		this.ticketNumber = ticketNumber;
		this.daysInAdvance = daysInAdvance;
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (daysInAdvance >= 10) {
		return 30.00;
		}
		else {
		return 40.00;
		}
	}
}
