
public class Car {
	private String name;
	private String modale;
	private String type;
	private Engine eng;
	private Tyre t1;
	private Tyre t2;
	private Tyre t3;
	private Tyre t4;
	
	public Car(String name, String modale, String type, int engCapacity, String engType, String tyreType) {
		super();
		this.name = name;
		this.modale = modale;
		this.type = type;
		this.eng = new Engine(engCapacity, engType);
		this.t1 = new Tyre(tyreType);
		this.t2 = new Tyre(tyreType);
		this.t3 = new Tyre(tyreType);
		this.t4 = new Tyre(tyreType);
	}
	
	public void init() {
		this.eng.turnOn();
	}
	
	public void stop() {
		this.eng.turnOff();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", modale=" + modale + ", type=" + type + ", " + eng.toString() + ", tyre1" + t1.toString() + ", tyre2" + t2.toString() + ", tyre3" + t3.toString() + ", tyre4" + t4.toString() + "]";
	}
	
}
