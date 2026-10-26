package america;

public class GameManager {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		
//		System.out.println("変更前のHP："  + warrior.getHp());
//		
//		warrior.setHp(80);
		
		warrior.rest();
		
		warrior.showStatus();
	}
}
