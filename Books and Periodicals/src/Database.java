import java.util.ArrayList;

public class Database {
	
	public ArrayList<Items> itemList = new ArrayList<Items>();
	
	public void AppendList(Items i) {
		itemList.add(i);
	}
	
	public ArrayList<Items> getList() {
		return itemList;
	}
	
	
}
