package day06.ex;

public class Book {
	private String title;
	private int price;
	
	public Book() {	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print(){
		System.out.printf("[제목:%-10s,가격:%6d]%n",title,price);
	}
}
