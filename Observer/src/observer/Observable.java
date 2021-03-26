package observer;

public interface Observable {
	void subscribe(Observer topicSubscriber);
	void unsubscribe(Observer topicSubscriber);
	void notifyObservers();
	String getUpdate();
}
