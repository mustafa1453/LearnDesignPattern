package observer;

public class StockSubscriber implements Subscriber {

	private double imbPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIdTracker = 0;
	
	private int observerID;
	
	// private Publisher stockGrabber;
	
	public StockSubscriber(Publisher stockGrabber) {
		// this.stockGrabber = stockGrabber;
		this.observerID = ++observerIdTracker;
		
		System.out.println("New subscriber is created " + this.observerID);
		stockGrabber.register(this);
		
	}
	
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		
		this.imbPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printPrices();
		
	}
	
	public void printPrices() {
		System.out.println(
				"#" + observerID + "\n"
				+ "IBM: " + imbPrice + "\n"
				+ "GOOGLE:" + googPrice + "\n"
				+ "APPLE:" + aaplPrice + "\n");
	}

}
