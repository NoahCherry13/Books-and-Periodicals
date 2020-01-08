
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

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
