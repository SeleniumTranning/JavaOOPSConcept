package ClassObjects;

public class MainClass {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		ph.color = "Black";
		ph.value = 10000;
		
		System.out.println(ph.color);
		System.out.println(ph.value);
		ph.display();

	}

}
