package Encapsulation;

public class Phone {
	
	private int value;
	private String color;
	
	void display(){
		System.out.println("Method To display");
	}
	
	void set_Value(int val){
		value = val;
	}
	
	int get_Value(){
		return value;
	}

	void set_Color(String col){
		color = col;
	}
	
	String get_Color(){
		return color;
	}
	
}
