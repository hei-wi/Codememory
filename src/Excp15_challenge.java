import java.util.Random;
import java.util.Scanner;

class Character {
	Random rand = new Random();

	String name;
	String job;
	int money;
	int hp;
	int attack;
	int defense;

	public Character(String name) {
		this.name = name;
		this.job = "無職";
		this.money = rand.nextInt(100);
		this.hp = rand.nextInt(100);
		this.attack = rand.nextInt(100);
		this.defense = rand.nextInt(100);
	}

	public Character(String name, String job) {
		this.name = name;
		this.job = job;
		this.money = rand.nextInt(401) + 100;
		this.hp = rand.nextInt(51) + 100;
		this.attack = rand.nextInt(21) + 20;
		this.defense = rand.nextInt(21) + 20;
	}

	public Character(String name, int money) {
		this.name = name;
		this.job = "無職";
		this.money = money;
		this.hp = rand.nextInt(51) + 100;
		this.attack = rand.nextInt(21) + 20;
		this.defense = rand.nextInt(21) + 20;
	}

	public Character(String name, String job, int money) {
		this.name = name;
		this.job = job;
		this.money = money;
		this.hp = rand.nextInt(51) + 100;
		this.attack = rand.nextInt(21) + 20;
		this.defense = rand.nextInt(21) + 20;
	}

	void showInfo() {
		System.out.println("===キャラクター完成===");
		System.out.println("名前：" + this.name);
		System.out.println("職業：" + this.job);
		System.out.println("お金：" + this.money + "円");
		System.out.println("Hp：" + this.hp);
		System.out.println("Attack：" + this.attack);
		System.out.println("Defense：" + this.defense);
	}

}

public class Excp15_challenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean frg1 = true;
		boolean frg2 = true;
		

		while(frg1) {
		System.out.println("名前をいれて");
		String userName = sc.next();

		other: while (frg2) {

			System.out.println("どちらか1つを選んでね！");
			System.out.println("１：職業を自分で決める");
			System.out.println("2：職業をお任せにする");

			int num = sc.nextInt();

			if (num == 1) {

				System.out.println("職業を入力してね");
				System.out.println();
				String jobName = sc.next();
				 Character c =  new Character(userName, jobName);
				c.showInfo();

				frg2 = false;

			} else if (num == 2) {
				System.out.println();
				Character c = new Character(userName);
				c.showInfo();

				frg2 = false;

			} else {
				System.out.println();
				System.out.println("入力が間違っています");
				System.out.println("やり直してください");
				System.out.println();
				continue other;
			}

		}
		
		frg1 = false;
		
		}
		sc.close();
	}
}
