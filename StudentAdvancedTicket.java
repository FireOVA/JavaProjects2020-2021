
public class StudentAdvancedTicket extends AdvanceTicket{

	public StudentAdvancedTicket(int number, int ticketNumber) {
		super(number, ticketNumber);
		// TODO Auto-generated constructor stub
	}
	
	public void StudentAdvancedTicket(int ticketNumber, int daysInAdvance) {
		this.ticketNumber = ticketNumber;
	
	}
	
	public double getPrice() {
		return super.getPrice()/2.0;
	}
	
	public String toString() {
        return super.toString() + "(ID required)";
	}
	

}
