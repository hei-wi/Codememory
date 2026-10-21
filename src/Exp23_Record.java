record Item(String name, int price, String descripton) {

}

public class Exp23_Record {
	public static void main(String[] args) {
		Item item = new Item("エリクサー", 50000, "全部回復するすごい薬");
		System.out.println("商品名：" + item.name());
		System.out.println("価格：" + item.price() + "G");
		System.out.println("効果：" + item.descripton());
	}
}
