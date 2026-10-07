class LiveReservation {
	int totalGuests = 0; //予約人数

	void reserve() {
		totalGuests++;
		System.out.println("当日券を１名分予約しました");
	}

	void reserve(String guestName) {
		totalGuests++;
		System.out.println(guestName + "さんのチケットを１名分予約しました");
	}

	void reserve(int memberName) {
		totalGuests++;
		System.out.println("ファンクラブ会員番号" + memberName
				+ "のチケットを１名分予約しました");
	}

	void reserve(String guestName, int people) {
		totalGuests += people;
		System.out.println(guestName + "さんのチケットを２名分予約しました");
	}

	void reserve(int people, String guestName) {
		totalGuests += people;
		System.out.println(guestName + "さんのチケットを２名分予約しました");
	}

	void showTotal() {
		System.out.println("現在の予約人数：" + totalGuests + "人");
	}
}

public class Exp11_challenge {
	public static void main(String[] args) {
		LiveReservation live = new LiveReservation();

		live.reserve();
		live.reserve("あおい");
		live.reserve(205);
		live.reserve("れん", 3);
		live.reserve(2, "みさき");
		live.showTotal();
	}
}