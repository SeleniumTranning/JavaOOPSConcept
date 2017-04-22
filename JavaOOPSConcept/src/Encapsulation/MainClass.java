package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		Phone ph = new Phone();
		ph.set_Value(10000);
		ph.set_Color("Black");
		
		System.out.println(ph.get_Value());
		System.out.println(ph.get_Color());
		ph.display();

	}

}
