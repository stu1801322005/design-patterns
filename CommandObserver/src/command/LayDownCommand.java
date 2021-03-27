package command;

import main.Trainee;

public class LayDownCommand implements Command {
	private Trainee trainee;
	
	@Override
	public void execute() {
		this.trainee.layDown();
	}

	@Override
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

}
