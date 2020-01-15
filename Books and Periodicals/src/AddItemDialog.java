import javax.swing.*;
import BreezySwing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.event.*;

@SuppressWarnings("unused")
public class AddItemDialog extends GBDialog implements ItemListener {

	public AddItemDialog(JFrame parent, Database data) {
		super(parent);
//		option.addItem("\n");
		d = data;
		option.addItem("Books");
		option.addItem("Periodicals");
		option.addItemListener(this);
		titlelbl.setVisible(false);
		ttlFld.setVisible(false);
		authorlbl.setVisible(false);
		aFld.setVisible(false);
		issuelbl.setVisible(false);
		issFld.setVisible(false);
		option.setSelectedIndex(-1);
		this.setSize(500, 400);
		this.setVisible(true);
	}

	Database d;

	JLabel titlelbl = addLabel("Title", 2, 1, 1, 1);
	JTextField ttlFld = addTextField("", 2, 2, 1, 1);
	JLabel authorlbl = addLabel("Author", 3, 1, 1, 1);
	JTextField aFld = addTextField("", 3, 2, 1, 1);
	JLabel issuelbl = addLabel("Issue:", 3, 1, 1, 1);
	IntegerField issFld = addIntegerField(0, 3, 2, 1, 1);
	JComboBox<String> option = addComboBox(1, 2, 1, 1);
	JButton enterButton = addButton("Enter", 4, 1, 1, 1);
	JButton exit = addButton("Exit", 4, 2, 1, 1);

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {

			if (option.getSelectedIndex() == 0) {
//				 option.removeItem("\n");
//				 revalidate();
				ttlFld.setText("");
				aFld.setText("");
				issFld.setNumber(0);
				issuelbl.setVisible(false);
				issFld.setVisible(false);
				titlelbl.setVisible(true);
				ttlFld.setVisible(true);
				authorlbl.setVisible(true);
				aFld.setVisible(true);
			} else if (option.getSelectedIndex() == 1) {
//				 option.removeItem("\n");
//				 revalidate();
				ttlFld.setText("");
				aFld.setText("");
				issFld.setNumber(0);
				aFld.setVisible(false);
				authorlbl.setVisible(false);
				titlelbl.setVisible(true);
				ttlFld.setVisible(true);
				issuelbl.setVisible(true);
				issFld.setVisible(true);

			}
		}

	}

	public void buttonClicked(JButton b) {
		if (b == enterButton) {
			if(option.getSelectedIndex() == 0) {
				if (ttlFld.getText().isBlank()) {
					messageBox("Please Enter a Title");
					return;
					
				}else if (aFld.getText().isBlank()) {
					messageBox("Please Enter an Author");
					return;
				}
				d.AppendList(new Book(ttlFld.getText(), aFld.getText()));
				messageBox("Book Added");
				ttlFld.setText("");
				aFld.setText("");
			
			}else if(option.getSelectedIndex() == 1) {
				if (issFld.getText().isBlank()) {
					messageBox("Please Enter an Issue");
					return;
				}else if (ttlFld.getText().isBlank()) {
					messageBox("Please Enter a Title");
					return;
				}else if (issFld.getNumber()<1) {
					messageBox("Please Enter a Valid Issue Number");
					return;
				}
				d.AppendList(new Periodical(issFld.getNumber(), ttlFld.getText()));
				messageBox("Periodical Added");
				ttlFld.setText("");
				issFld.setNumber(0);
			}
		}else if (b == exit) {
			dispose();
		}
	}

}
