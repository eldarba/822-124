package app.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bank.core.Bank;
import bank.core.Client;
import bank.core.ClientGold;
import bank.core.ClientPlatinum;
import bank.core.ClientRegular;
import bank.core.exceptions.BankException;

/** you can use Swing to create GUI (or Java FX) */
public class BankViewGUI {

	static {
		try {
			bank = Bank.getInstance();
		} catch (BankException e) {
			e.printStackTrace();
		}

	}

	// create a model object
	private static Bank bank;

	// runnable code
	public static void main(String[] args) {

		// main window
		JFrame fr = new JFrame("Bank System");
		fr.setBounds(100, 100, 500, 300);
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// GUI controls
		JLabel lbAddClient = new JLabel("Add New Client");
		lbAddClient.setBounds(50, 50, 125, 25);
		fr.add(lbAddClient);

		JLabel lbClientId = new JLabel("ID");
		lbClientId.setBounds(50, 70, 125, 25);
		fr.add(lbClientId);

		JTextField tfId = new JTextField();
		tfId.setBounds(150, 70, 125, 25);
		fr.add(tfId);

		JLabel lbClientName = new JLabel("Name");
		lbClientName.setBounds(50, 100, 125, 25);
		fr.add(lbClientName);

		JTextField tfName = new JTextField();
		tfName.setBounds(150, 100, 125, 25);
		fr.add(tfName);

		JLabel lbClientBalance = new JLabel("Balance");
		lbClientBalance.setBounds(50, 130, 125, 25);
		fr.add(lbClientBalance);

		JTextField tfBalance = new JTextField();
		tfBalance.setBounds(150, 130, 125, 25);
		fr.add(tfBalance);

		JLabel lbClientType = new JLabel("Type");
		lbClientType.setBounds(50, 160, 125, 25);
		fr.add(lbClientType);

		JComboBox<String> comboType = new JComboBox<>(new String[] { "Regular", "Gold", "Platinum" });
		comboType.setBounds(150, 160, 125, 25);
		fr.add(comboType);

		JButton btAddClient = new JButton("Add Client");
		btAddClient.setBounds(50, 190, 125, 25);
		fr.add(btAddClient);

		// the controller binds the button (view) to the model (Bank class)
		btAddClient.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// this code runs each time you click the button
				// get data from gui
				int id = Integer.parseInt(tfId.getText());
				String name = tfName.getText();
				float balance = Float.parseFloat(tfBalance.getText());
				// create a client (based on data from gui)
				Client client = null;
				switch ((String) comboType.getSelectedItem()) {
				case "Regular":
					client = new ClientRegular(id, name, balance);
					break;
				case "Gold":
					client = new ClientGold(id, name, balance);
					break;
				case "Platinum":
					client = new ClientPlatinum(id, name, balance);
					break;

				default:
					break;
				}
				// use the model to add the client to the bank
				bank.addClient(client);

			}
		});

		fr.setVisible(true);
	}

}
