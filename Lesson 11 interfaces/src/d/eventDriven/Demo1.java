package d.eventDriven;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo1 {

	public static void main(String[] args) {

		JFrame fr = new JFrame("Demo 1");
		fr.setBounds(100, 100, 500, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(new GridLayout(0, 1, 10, 10));

		JButton bt1 = new JButton("bt1");
		JButton bt2 = new JButton("bt2");
		JButton bt3 = new JButton("bt3");
		JButton bt4 = new JButton("bt4");

		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		pn1.add(bt1);
		pn2.add(bt2);
		pn3.add(bt3);
		pn4.add(bt4);

		fr.add(pn1);
		fr.add(pn2);
		fr.add(pn3);
		fr.add(pn4);

		fr.setVisible(true);

		// registration 1 - bound the button to a listener using an implement in class
		bt1.addActionListener(new MyActionListener());

		// registration 2 - bound the button to a listener using an anonymous inner
		// class
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 2 clicked");

			}

		});

		// LAMBDA EXPRESSIONS
		// lambda expressions returns objects

		// registration 3 - bound the button to a listener using lambda expression
		bt3.addActionListener(e -> System.out.println("button 3 clicked"));

		// registration 4 - bound the button to a listener using lambda expression with
		// many code lines
		bt4.addActionListener((e) -> {
			System.out.println("button 4 clicked");
			//
			Object obj = e.getSource(); // the object that fired the event - the button
			JButton bt = (JButton) obj; // casting the event source to JButton
			System.out.println(bt.getText() + " clicked"); // get access to JButton methods
			//
			System.out.println(((JButton) e.getSource()).getText() + " clicked");
			System.out.println("==========");
		});

	}

	static class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button 1 clicked");
		}

	}

}
