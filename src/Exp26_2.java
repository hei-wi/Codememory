class GameCharacte3 {
	// インスタンスフィールド 
	String name;
	int hp;

	//クラスフィールド
	static int partyGold = 100;

	// インスタンスメソッド 
	void showStatus() {
		System.out.println(name + " HP：" + hp);
	}

	//クラスメソッド
	static void showGold() {
		System.out.println("パーティーの所持金：" + partyGold + "Ｇ");

	}

	GameCharacte3() {
		System.out.println("キャラクターを作成しました");
	}

	GameCharacte3(String name) {
//		System.out.println(name + "を作成しました");
	}

}

class Warrior３ extends GameCharacte3 {
	public Warrior３() {
	}
	
	
	
	public Warrior３(String name) {
		super(name);
		System.out.println(name + "を戦士として作成しました");
	}
}

class Mage2 extends GameCharacte3 {

}

public class Exp26_2 {
	public static void main(String[] args) {
		Warrior３ warrior = new Warrior３();
		Warrior３ namedWarrior３ = new Warrior３("アーサー");

		warrior.name = "アーサー";
		warrior.hp = 120;

//		Mage2 mage = new Mage2();

//		mage.showStatus();
//		mage.name = "メル";
//		mage.hp = 80;

		warrior.showStatus();

		Warrior３.showGold();
		Mage2.showGold();
		System.out.println();

		Warrior３.partyGold = 500;

		Warrior３.showGold();
		Mage2.showGold();

	}
}
