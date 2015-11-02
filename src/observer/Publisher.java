package observer;

public interface Publisher {
	void register(Subscriber s);
	void unregister(Subscriber s);
	void notifyObserver();
}
