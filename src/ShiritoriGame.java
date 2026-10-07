class ShiritoriMethod{
	void showApple() {
		System.out.println("りんご");
		this.showGorilla();
	}
	
	void showGorilla() {
		System.out.println("ごりら");
		this.showRamen();
	}
	
	void showRamen() {
		System.out.println("らーめん");
	}
	
	
}



public class ShiritoriGame {
	public static void main(String[] args) {
		ShiritoriMethod shiritori = new ShiritoriMethod();
		
		shiritori.showApple();
	}
}
