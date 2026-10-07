class CDShop {
	
	int[] productNumbers = { 101, 102, 103, 104, 105};
	String[] productNames = { "ぱわーオブらぶ", "Magical Tank-top Parade", "好きすぎて滅!", "834.194" ,"スパー来る"};
	int[] prices = { 1200, 3300, 1650, 3850, 4000 };

	// int 型の商品番号から検索するsearch メソッドを定義する 
	void serch(int productNumber) {
		int count = 0;
		for (int i = 0; i < productNumbers.length; i++) {
			if (productNumber == productNumbers[i]) {
				System.out.println("【商品番号："
						+ productNumbers[i] + "　商品名：" + productNames[i]
						+ "　価格：" + prices[i] + "円】");
				return;

			} else {
				count++;

				if (count == productNumbers.length) {
					System.out.println("当てはまるものはありませんでした");
					return;
				}
			}
		}
	}

	
	// String 型の商品名から検索するsearch メソッドを定義する 
	void serch(String keyword) {
		int count = 0;
		for (int i = 0; i < productNames.length; i++) {
			if (productNames[i].contains(keyword)) {
				System.out.println("【商品番号："
						+ productNumbers[i] + "　商品名：" + productNames[i]
						+ "　価格：" + prices[i] + "円】");
				return;

			} else {
				count++;

				if (count == productNumbers.length) {
					System.out.println("当てはまるものはありませんでした");
					return;
				}
			}
		}
	}
}

public class Exp10_charange {
	public static void main(String[] args) {
		CDShop shop = new CDShop();
		
		shop.serch(105);
		shop.serch("Tank");
	}
}
