package observer;

public class Client implements Observer {
	
	public String name;
	public Observable instructor;
	
	public Client(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(instructor == null) {
			System.out.println(this.getName() + " has no instructor");
			return;
		}
		
		String newInstructor = instructor.getUpdate();
		System.out.println(this.getName() + ": recieved new exercise: " + newInstructor);

	}

	@Override
	public void setTopic(Observable topic) {
		this.instructor = topic;

	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
