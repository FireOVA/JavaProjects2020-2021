
public abstract class Ticket {
	private int number;
	int ticketNumber;
    
    public Ticket(int number, int ticketNumber) {
        this.number = number;
        this.ticketNumber = ticketNumber;
    }
    
    public abstract double getPrice();
    
    public String toString() {
        return "Number: " + this.number + 
               ", Price: " + this.getPrice();
    }
}
