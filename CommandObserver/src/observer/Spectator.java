package observer;

public class Spectator implements Observer {
	private String name;
	private boolean layingDown;
	private Observable trainee;
	
	public Spectator(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}
	
	public Observable getTrainee() {
		return this.trainee;
	}
	
	private String getCurrentExercise() {
		return layingDown ? " laid down." : " standed up.";
	}
	
	@Override
	public void update() {
		if(trainee == null) {
			System.out.println("No trainee to watch.");
			return;
		}
		layingDown = trainee.getUpdate();
		System.out.println("The spectator: " + this.getName() + this.getCurrentExercise());

	}

}
