package sunbeam.set;

import java.util.Objects;

public class Book {

	private String isbn ;
	private Double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		
	}

	public Book(String isbn, Double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(this.isbn);
//	}

	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(authorName, other.authorName) && Objects.equals(isbn, other.isbn)
//				&& Objects.equals(price, other.price) && quantity == other.quantity;
//	}
	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Book) {
			Book other = (Book) obj;
			if(this.isbn.equals(other.isbn) );
			return true;
		}
		return false;
	}
	
}
