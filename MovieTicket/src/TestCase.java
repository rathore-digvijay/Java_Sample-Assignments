
public class TestCase {
	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();
		mt.movieName = "50 shades of Grey";
		mt.row ='A';
		mt.seat = 20;
		mt.screen = 'B';
		mt.price = 250.73;
		mt.date = "26/07/2017";
		mt.time = "10:30 PM";
		System.out.println("Theatre Name : "+mt.threatreName);
		System.out.println("Movie Name : "+mt.movieName);
		System.out.println("Row : "+mt.row);
		System.out.println("Seat  : "+mt.seat);
		System.out.println("Screen : "+mt.screen);
		System.out.println("Price : "+mt.price);
		System.out.println("Date : "+mt.date);
		System.out.println("Time : "+mt.time);
			}
}
