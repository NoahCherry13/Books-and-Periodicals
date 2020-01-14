
public class Periodical extends Items {

	private int issue;
	
	public Periodical (int iss, String s) {
		super(s);
	}
	
	public void setIssue(int i) {
		issue = i;
	}
	
	public int getIssue() {
		return issue;
	}

	
	public void print() {
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
