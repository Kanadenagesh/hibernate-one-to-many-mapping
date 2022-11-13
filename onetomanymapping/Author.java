package onetomanymapping;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Author {
	@Id
	@GeneratedValue
	@PrimaryKeyJoinColumn
	@Column(name="author_id")
	private int author_id;
	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", author_name=" + author_name + ", book=" + book + "]";
	}
	@Column(name="author_name")
	private String author_name;
	@OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
	private List<Book> book;
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	

}
