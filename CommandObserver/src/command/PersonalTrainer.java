package command;

public class PersonalTrainer {
	private String name;
	private Command command;
	
	public PersonalTrainer(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void setExercise() {
		System.out.println("The personal trainer: "+ this.getName() + " set exercise.");
		command.execute();
	}
	

}
