package observer;


public class Main {

	public static void main(String[] args) {
		
		StockGrabber grabber = new StockGrabber();
		
		StockSubscriber s1 = new StockSubscriber(grabber);
		StockSubscriber s2 = new StockSubscriber(grabber);
		
		grabber.setAaplPrice(53.45);
		grabber.setGoogPrice(38.84);
		grabber.setIbmPrice(79.12);

	}

}
