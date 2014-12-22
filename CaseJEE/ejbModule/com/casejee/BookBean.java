package com.casejee;

import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookBean implements BookBeanLocal, BookBeanRemote {
	@PersistenceContext
	EntityManager em;
	public static final String RemoteJNDIName = BookBean.class.getSimpleName()
			+ "/remote";
	public static final String LocalJNDIName = BookBean.class.getSimpleName()
			+ "/local";

	public void test() {
		Book book = new Book(null, "Hello Java Bean I!", "Edward");
		em.persist(book);
		Book book2 = new Book(null, "Hello Java Bean II", "czetsuya");
		em.persist(book2);
		Book book3 = new Book(null, "Hello Java Bean III", "ipiel");
		em.persist(book3);
		System.out.println("list some books");
		List<Book> someBooks = em.createQuery("from Book b where b.author=:name")
				.setParameter("name", "czetsuya").getResultList();
		for (Iterator iter = someBooks.iterator(); iter.hasNext();) {
			Book element = (Book) iter.next();
			System.out.println(element);
		}
		System.out.println("List all books");
		List<Book> allBooks = em.createQuery("from Book").getResultList();
		for (Iterator<Book> iter = allBooks.iterator(); iter.hasNext();) {
			Book element = (Book) iter.next();
			System.out.println(element);
		}
		System.out.println("delete a book");
		em.remove(book2);
		System.out.println("List all books");
		allBooks = em.createQuery("from Book").getResultList();
		for (Iterator<Book> iter = allBooks.iterator(); iter.hasNext();) {
			Book element = (Book) iter.next();
			System.out.println(element);
		}
	}
}
