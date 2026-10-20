class MenuItem {
	private String name;
	private int price;

	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}
}

class Order {
	private MenuItem item;
	private int quantity;

	public Order(MenuItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	int calculateTotal() {
		return item.getPrice() * quantity;
	}

	void showOrder() {
		System.out.println("商品名：" + item.getName() + "注文個数：" + quantity);
		System.out.println("合計：" + calculateTotal()+ "円");
	}
}

public class Exp22_challenge {
	public static void main(String[] args) {
		MenuItem menu1 = new MenuItem("ハンバーガー", 350);
		MenuItem menu2 = new MenuItem("ポテト", 350);
		
		Order order1 = new Order(menu1, 2);
		Order order2 = new Order(menu2, 1);
		
		order1.showOrder();
		System.out.println();
		order2.showOrder();
	}
}
