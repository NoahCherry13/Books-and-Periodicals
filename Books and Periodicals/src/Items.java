
public abstract class Items implements Comparable{
	
	public String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String s) {
		title = s;
	}

	public Items(String t) {
		title = t;
	}
	
	public abstract int compareTo(Object o);
	public abstract void print();
	
	
}
