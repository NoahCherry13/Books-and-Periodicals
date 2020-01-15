import javax.swing.*;
import BreezySwing.*;
import java.util.ArrayList;

public class BookPeriodicalGUI extends GBFrame {

	JButton addBook = addButton("Add Item", 1, 1, 1, 1);
	JButton compareButton = addButton("Compare", 3, 1, 1, 1);
	JButton exit = addButton("Exit", 4, 1, 1, 1);

	Database d = new Database();

	public static void main(String[] args) {
		JFrame frm = new BookPeriodicalGUI();
		frm.setTitle("Ace Program");
		frm.setSize(700, 500);
		frm.setVisible(true);

	}

	public void buttonClicked(JButton b) {
		if (b == addBook) {
			AddItemDialog add = new AddItemDialog(this, d);
		} else if (b == compareButton) {
			CompareDialog comp = new CompareDialog(this, d);
		} else if (b == exit) {
			System.exit(0);
		}
	}

}
