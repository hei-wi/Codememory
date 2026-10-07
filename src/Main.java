class MethodSequence{
	void showA() {
		System.out.println("メソッドA");
	}
	
	void showB() {
		System.out.println("メソッドB");
	}
	
	void showC() {
		System.out.println("メソッドC");
	}
	
	void showAll() {
		this.showA();
		this.showB();
		this.showC();
	}
}

public class Main {
	public static void main(String[] args) {
		MethodSequence sequence = new MethodSequence();
		
		sequence.showAll();
	}
}
