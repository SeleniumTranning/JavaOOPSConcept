package Constructor;

public class MainClass {

	public static void main(String[] args) {
		
		Phone ph = new Phone(10000, "Black");
		System.out.println(ph.color);
		System.out.println(ph.value);
		ph.display();
		
		System.out.println("############");
		Phone ph2 = new Phone("Blue",20000);
		System.out.println(ph2.color);
		System.out.println(ph2.value);
		ph2.display();
		
		System.out.println("############");
		Phone ph3 = new Phone("White");
		System.out.println(ph3.color);
		System.out.println(ph3.value);
		ph3.display();
		
		System.out.println("############");
		Phone ph4 = new Phone(30000);
		System.out.println(ph4.color);
		System.out.println(ph4.value);
		ph4.display();
		

	}

}
