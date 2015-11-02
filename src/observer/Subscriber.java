package observer;

public interface Subscriber {
	void update(double ibmPrice, double aaplPrice, double googPrice);
}
