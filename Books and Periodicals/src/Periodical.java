
public class Periodical extends Items {

	private int issue;
	
	public Periodical (int iss, String s) {
		super(s);
		issue = iss;
	}
	
	public void setIssue(int i) {
		issue = i;
	}
	
	public int getIssue() {
		return issue;
	}

	
	public String print() {
		return ("Issue: " + issue + '\n' + "Title: " + title);

		
	}

	@Override
	public int compareTo(Items o) throws ClassCastException {
		if (o instanceof Book) {
			throw new ClassCastException("Cannot compare Periodical to Book");
		}

		Periodical p = (Periodical) o;

		return issue-p.getIssue();
	}
}
