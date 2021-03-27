package main;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import command.Command;
import command.PersonalTrainer;
import observer.Spectator;

public class MainClass {

	public static void main(String[] args) {
		AbstractFactory commandFactory = FactoryProducer.getFactory("Command"); 
		PersonalTrainer personalTrainer = new PersonalTrainer("Viktor");
		Trainee trainee = new Trainee("George");
		
		Spectator firstSpectator = new Spectator("Ani");
		Spectator secondSpectator = new Spectator("Viki");
		Spectator thirdSpectator = new Spectator("Megi");
		
		Command layDown = commandFactory.getCommand("lay down");
		layDown.setTrainee(trainee);
		Command standUp = commandFactory.getCommand("stand up");
		standUp.setTrainee(trainee);
		
		trainee.subscribe(firstSpectator);
		trainee.subscribe(secondSpectator);
		trainee.subscribe(thirdSpectator);
		
		personalTrainer.setCommand(layDown);
		personalTrainer.setExercise();

		personalTrainer.setCommand(standUp);
		personalTrainer.setExercise();

	}

}
