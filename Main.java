
public class Main {
	public static void main(String[] args) {
		Car c1 = new Car("Hyundai", "2022", "Electric Car",1000 ,"Electric engine", "normal");
		c1.init();
		System.out.println(c1.toString());
		c1.stop();
	}
}
