
public class WalkupTicket extends Ticket{
	
	public WalkupTicket(int number, int ticketNumber) {
		super(number, ticketNumber);
		// TODO Auto-generated constructor stub
	}
	
	public void WalkupTicket(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50.00;
	}

}
