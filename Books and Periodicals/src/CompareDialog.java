import javax.swing.*;
import BreezySwing.*;
import java.util.ArrayList;
import java.util.ArrayList;
public class CompareDialog extends GBDialog{

	public CompareDialog(JFrame Parent, Database data) {
		super(Parent);
		d = data;
		items = d.getList();
		items = d.getList();
		populate();
		revalidate();
		this.setSize(500, 400);
		this.setVisible(true);
	}
	Database d;
	
	ArrayList<Items> items;
	Items selected;
	JTextArea beforeArea = addTextArea("",2,2,1,1);
	JList<String> itemList = addList(2,1,1,1);
	JLabel beforelbl = addLabel("Items Before:",1,2,1,1);
	JLabel samelbl = addLabel("Equal Items:",1,3,1,1);
	JLabel afterlbl = addLabel("Items After:",1,4,1,1);
	JTextArea sameArea = addTextArea("",2,3,1,1);
	JTextArea afterArea = addTextArea("",2,4,1,1);
	JButton exit = addButton ("Exit",3,1,1,1);
	
	public void populate() {
		DefaultListModel<String> DLM = (DefaultListModel<String>)itemList.getModel();
		if (d.getList().size() == 0)return;
		for (Items i: items) {
			DLM.addElement(i.getTitle());
			
		}
	}
	
	public void listDoubleClicked(JList<String> list, String itemSelected) {
		selected = items.get(list.getSelectedIndex());
		compare();
	}
	
	public void listItemSelected() {
		
	}
	
	public void compare() {
		beforeArea.setText("");
		sameArea.setText("");
		afterArea.setText("");
		
		int result;
		
		for(Items i : items) {
			if (i == selected) continue;
			try {
				result = selected.compareTo(i);
			}catch(ClassCastException e) {
				continue;
			}
			if (result < 0) {
				afterArea.append(i.print()+ '\n'+ '\n');
			}else if (result == 0) {
				sameArea.append(i.print()+ '\n'+ '\n');
			}else beforeArea.append(i.print()+ '\n'+ '\n');
		}
	}
	
	public void buttonClicked(JButton b) {
		if (b == exit) {
			dispose();
		}
	}
}
