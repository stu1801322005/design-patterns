package abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if (factory == "Command") {
			return new CommandFactory();
		}
		System.out.println("Cannot create factory " + factory);
		return null;
	}

}
