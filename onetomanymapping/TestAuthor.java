package onetomanymapping;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestAuthor {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Author.class);
		config.addAnnotatedClass(Book.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		Author author = new Author();
		Book book = new Book();
		author.setAuthor_name("Nagesh Kanade");
		book.setAuthor(author);
		
		book.setBook_name("How To Enjoy LIfe");
		book.setPublication_year(2022);
		Book b1 = new Book();
		b1.setBook_name("Shinig Starts");
		b1.setAuthor(author);
		b1.setPublication_year(2022);
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(b1);
		list.add(book);
		author.setBook(list);
		session.persist(author);
		System.out.println(author.toString());
		
		
		session.getTransaction().commit();
		sessionfactory.close();
		session.close();
		 
	}

}
