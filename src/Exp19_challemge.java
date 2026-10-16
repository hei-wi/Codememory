class MovieReview {
	private String title;
	private int rating;

	public String getTitle() {
		return this.title;
	}

	public int getRating( ) {
		return this.rating;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setRating(int rating) {
		if (rating >= 1 && rating <= 5) {
			this.rating = rating;
		}
	}
}

public class Exp19_challemge {
	public static void main(String[] args) {
		MovieReview move = new MovieReview();
		
		move.setTitle("星空の冒険");
		move.setRating(4);
		
		
		String title = move.getTitle();
		int rating = move.getRating();
		
		System.out.println(title + "　評価：" + rating);
	}
}
