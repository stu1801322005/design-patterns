package command;

import main.Trainee;

public class StandUpCommand implements Command {
	private Trainee trainee;
	
	@Override
	public void execute() {
		this.trainee.standUp();
	}

	@Override
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

}
