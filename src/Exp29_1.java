class Monster {
	private int hp;

	public Monster(int hp) {
		this.hp = hp;
		System.out.println("Monsterの処理");
	}

	public int getHp() {
		return hp;
	}
}

class Slime extends Monster {
	private String species;

	public Slime() {
		//super(24)でも18行目どちらも同じ結果になる
		this("スライム", 24);
		
		System.out.println("引数なしSlimeの処理");
		
		species = "スライム";
	}

	public Slime(String species, int hp) {
		super(hp);

		this.species = species;
		System.out.println("引数アリSlimeの処理");
	}

	public void showProfile() {
		System.out.println("種族名：" + species);
		System.out.println("HP：" + getHp());
	}
}

public class Exp29_1 {
	public static void main(String[] args) {
		Slime slime1 = new Slime();
		slime1.showProfile();
		
		Slime slime2  = new Slime("キングスライム", 100);
		slime2.showProfile();
	}
}
