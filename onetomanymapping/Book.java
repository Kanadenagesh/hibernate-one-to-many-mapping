package onetomanymapping;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue
	@Column(name="book_id")
	private int book_id;
	
	@Column(name="book_name")
	private String book_name;
	@Column(name="publication_year")
	private int publication_year;
	
	@OneToOne(targetEntity = Author.class)
	private Author author;
	
	public int getBook_id() {
		return book_id;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}

}
