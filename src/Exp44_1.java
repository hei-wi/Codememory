abstract sealed class Monste
		permits NormalMonster, BossMonster, FinalBoss {
	private String name;

	Monste(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("モンスター名：" + this.name);
	}

	public abstract int calculateDamage();
}

abstract non-sealed class NormalMonster extends Monste {
	NormalMonster(String name) {
		super(name);
	}
}

abstract non-sealed class BossMonster extends Monste {
	BossMonster(String name) {
		super(name);
	}
}

final class FinalBoss extends Monste {
	private int attack;

	FinalBoss(String name, int attack) {
		super(name);
		this.attack = attack;
	}

	@Override
	public int calculateDamage() {
		return this.attack * 3;
	}
}

//final class Slime extends Monster { 
//    private int attack; 
//
// 
//
//    Slime(String name, int attack) { 
//        super(name); 
//        this.attack = attack; 
//    } 
//
// 
//
//    @Override 
//    public int calculateDamage() { 
//        return this.attack; 
//    } 
//} 

public class Exp44_1 {
	public static void main(String[] args) {
		FinalBoss boss = new FinalBoss("魔王", 100);
		
		boss.showName();
		
		System.out.println("ダメージ：" + boss.calculateDamage());
	}
}
