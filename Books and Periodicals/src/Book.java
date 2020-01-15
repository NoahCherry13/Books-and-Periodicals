import javax.swing.*;

public class Book extends Items {

	private String author;

	public Book(String t, String a) {
		super(t);
		author = a;
	}

	public void setAuthor(String a) {
		author = a;
	}

	public String getAuthor() {
		return author;
	}

	public String print() {
		return ("Author: " + author + '\n' + "Title: " + title);
	}

	@Override
	public int compareTo(Items o) throws ClassCastException {
		if (o instanceof Periodical) {
			throw new ClassCastException("Cannot compare book to periodical");
		}

		Book b = (Book) o;

		return author.compareTo(b.getAuthor());
	}

}
