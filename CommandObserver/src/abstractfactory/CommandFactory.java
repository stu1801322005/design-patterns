package abstractfactory;

import command.Command;
import command.LayDownCommand;
import command.StandUpCommand;

public class CommandFactory extends AbstractFactory {
	
	@Override
	public Command getCommand(String command) {
		if (command.equals("lay down")) {
			return new LayDownCommand();
		}
		else if (command.equals("stand up")) {
			return new StandUpCommand();
		}
		else {
			System.out.println("Cannot create command " + command);
		}
		return null;
	}

}
