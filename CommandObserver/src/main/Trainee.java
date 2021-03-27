package main;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class Trainee implements Observable {
	private String name;
	List<Observer> observers = new ArrayList<Observer>();
	private boolean layingDown;
	
	public Trainee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void layDown() {
		this.layingDown = true;
		train();
	}
	
	public void standUp() {
		this.layingDown = false;
		train();
	}
	
	private void train() {
		if(layingDown) {
			System.out.println("The trainee: " + this.getName() + " laid down.");
		}
		else {
			System.out.println("The trainee: " + this.getName() + " standed up.");
		}
		notifyObservers();
	}
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTrainee(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public boolean getUpdate() {
		return this.layingDown;
	}

}
