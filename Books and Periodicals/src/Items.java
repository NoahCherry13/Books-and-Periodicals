
public abstract class Items implements Comparable<Items>{
	
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
	
	public abstract int compareTo(Items o);
	public abstract String print();
	
	
}
