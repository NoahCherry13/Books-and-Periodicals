import javax.swing.*;
import BreezySwing.*;
import java.util.ArrayList;

public class BookPeriodicalGUI extends GBFrame{

	JButton addBook = addButton("Add a Book",1,1,1,1);
	JButton addPeriodical = addButton("Add a Periodical",2,1,1,1);
	JButton compareButton = addButton("Compare",3,1,1,1);
	JButton exit = addButton ("Exit",4,1,1,1);
	
	ArrayList<Items> list = new ArrayList<Items>();
	
	public static void main(String[] args) {
		JFrame frm = new BookPeriodicalGUI();
		frm.setTitle("Ace Program");
		frm.setSize(700, 500);
		frm.setVisible(true);

	}
	
	public void buttonClicked(JButton b) {
		if (b == addBook) {
			
		}else if (b == addPeriodical) {
			
		}else if (b == compareButton) {
			
		}else if (b == exit) {
			System.exit(0);
		}
	}

}
