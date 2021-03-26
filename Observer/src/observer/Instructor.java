package observer;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements Observable {

	private List<Observer> observers;
	private String exercise;
	
	public Instructor() {
		this.observers =  new ArrayList<Observer>();
	}
	@Override
	public void subscribe(Observer topicSubscriber) {
		this.observers.add(topicSubscriber);
		topicSubscriber.setTopic(this);

	}

	@Override
	public void unsubscribe(Observer topicSubscriber) {
		this.observers.remove(topicSubscriber);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.GetExercise();
	}
	
	public String GetExercise() {
		return this.exercise;
	}
	
	public void setInstructor(String instructor) {
		this.exercise = instructor;
		this.notifyObservers();
	}

}
