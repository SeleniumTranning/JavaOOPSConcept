package Constructor;

public class Phone {
	
	int value;
	String color;
	
	void display(){
		System.out.println("Method To display");
	}
	
	Phone(int val, String col){
		value = val;
		color = col;
	}
	
	Phone(int val){
		value = val;
	}
	
	Phone(String col){
		color = col;
	}
	
	Phone(String col,int val){
		value = val;
		color = col;
	}

}
