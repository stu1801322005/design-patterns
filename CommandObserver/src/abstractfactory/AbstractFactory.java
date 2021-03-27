package abstractfactory;

import command.Command;

public abstract class AbstractFactory {
	public abstract Command getCommand(String command);
}
