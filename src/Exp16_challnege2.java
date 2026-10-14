class Pet {
	String name;
	String type;
	int age;

	
	public Pet() {
		this("たろう");
	}
	
	Pet(String name) {
		this(name,"犬");
	}

	Pet(String name, String type) {
		this(name,type,0);
		
	}

	Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println(name + " / " + type + " / " + age);
	}
}

public class Exp16_challnege2 {
	public static void main(String[] args) {
		Pet pet = new Pet();
		pet.showInfo();
	}
}
