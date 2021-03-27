package command;

import main.Trainee;

public interface Command {
	public void execute();
	public void setTrainee(Trainee trainee);
}
