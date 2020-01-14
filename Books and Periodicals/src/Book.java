import javax.swing.*;
public class Book extends Items{

	private String author;
	
	public Book(String t, String a) {
		super(t);
		author =a;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void print() {
		System.out.println("Author: +"+ author +'\n'+ "Title: "+ title);
	}

	@Override
	public int compareTo(Object o) throws ClassCastException{
		if (o instanceof Periodical) {
			throw new ClassCastException("Cannot compare book to periodical");
		}
		return 0;
	}
}
