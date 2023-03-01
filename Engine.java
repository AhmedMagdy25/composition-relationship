

enum Status{
	ON, OFF
}

public class Engine {
	private int capacity;
	private String type;
	private Status status = Status.OFF;
	
	public Engine(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	
	public void turnOn() {
		this.status = Status.ON;
		System.out.println("engine turned on...");	
	}

	public void turnOff() {
		this.status = Status.OFF;
		System.out.println("...engine turned off");	
	}
	
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + ", status="+ status +"]";
	}
	
}
