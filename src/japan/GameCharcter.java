package japan;

public class GameCharcter {
	private int hp = 50;
	
	public void showStatus() {
		System.out.println("HP：" + hp);
	}
	
	protected int getHp() {
		return hp;
	}
	
	protected void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
