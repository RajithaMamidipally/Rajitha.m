package Day5;
	import java.util.Scanner;

	public class TicketMain {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Ticket t = new Ticket();
			System.out.print("Enter no of bookings: ");
			int noOfBooking = sc.nextInt();
			
			System.out.println();
			System.out.print("Enter the available tickets: ");
			int availableTickets = sc.nextInt();
			t.setAvailableTickets(availableTickets);
			for(int i=0;i<noOfBooking;i++) {
			
				System.out.print("Enter the ticketid: ");
				int ticketId = sc.nextInt();
				t.setTicketid(ticketId);
				System.out.print("Enter the price: ");
				int price = sc.nextInt();
				t.setPrice(price);
				System.out.print("Enter the no of tickets: ");
				int noTicket = sc.nextInt();
				
				System.out.println("Available tickets: "+t.getAvailableTickets());
				System.out.println("Total amount: "+t.calculateTicketCost(noTicket));
				System.out.println("Available ticket after booking: "+t.getAvailableTickets());
				
			}
		}

	}

