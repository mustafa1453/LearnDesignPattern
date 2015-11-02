package observer;

import java.util.ArrayList;

public class StockGrabber implements Publisher {
	
	ArrayList<Subscriber> subscribers = new ArrayList();
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public void register(Subscriber s) {
		
		subscribers.add(s);
		
	}
	
	public void unregister(Subscriber s) {
		
		int index = subscribers.indexOf(s); 
		subscribers.remove(index);
		System.out.println("Subscriber has been deleted " + (index + 1));
		
	}
	
	public void notifyObserver() {
		for (Subscriber s : subscribers) {
			s.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	
}
