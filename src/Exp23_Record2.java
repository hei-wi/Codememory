record Skill(String name,String line,int power) { }

class Hero0{
	private String name;
	private int attackPower;
	private Skill skill;
	
	public Hero0(String name,int attackPower,Skill skill) {
		this.name = name;
		this.attackPower = attackPower;
		this.skill = skill;
	}
	
	void attack() {
		 int damege = attackPower* skill.power();
		 
		 System.out.println(name + "の" + skill.name());
		 System.out.println(skill.line());
		 System.out.println(damege + "ダメージ与えた");
	}
	
	
	
	
}

public class Exp23_Record2 {
	public static void main(String[] args) {
		Skill skill1 = new Skill("水の呼吸・壱の型", "水面切り！", 3);
		Skill skill2 = new Skill("メテオ", "いいですとも！", 4);
		
		Hero0 hero1 = new Hero0("釜土丹次郎", 18, skill1);
		Hero0 hero2 = new Hero0("ゴルベーザ", 12, skill2);
		
		hero1.attack();
		System.out.println();
		hero2.attack();
	}
}
