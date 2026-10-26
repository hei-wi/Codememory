package america;

import japan.GameCharcter;

public class Warrior extends GameCharcter{
	public void rest() {
		this.setHp(getHp() + 20);
	}
}
