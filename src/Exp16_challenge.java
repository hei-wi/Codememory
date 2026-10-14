class Book { 
    String title; 
    int price; 
    String category; 

     Book() {
    	 this("天気の子");
     }
    
    Book(String title) { 
        
    	this(title,1000);
    } 

    Book(String title, int price) {

    	this(title,price,"未分類");
    } 

    Book(String title, int price, String category) { 
        this.title = title; 
        this.price = price; 
        this.category = category; 
    } 
    
    void showInfo() {
    	System.out.println("タイトル：" + title);
    	System.out.println("値段:" +  price +  "円");
    	System.out.println("カテゴリー：" + category);
    }
} 


public class Exp16_challenge {
	public static void main(String[] args) {
		Book book = new Book();
		
		book.showInfo();
		
	}
}
