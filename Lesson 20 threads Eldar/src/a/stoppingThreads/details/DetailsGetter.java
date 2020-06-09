package a.stoppingThreads.details;

import javax.swing.JOptionPane;

public class DetailsGetter implements Runnable {

	// flag
	private boolean quit;

	// change flag
	public void quit() {
		quit = true;
	}

	@Override
	public void run() {

		// get user details
		String name = JOptionPane.showInputDialog("Enter Name");
		if (quit) {
			// clean up actions here
			JOptionPane.showMessageDialog(null, "we have been interrupted. Bye");
			return;
		}

		String mobile = JOptionPane.showInputDialog("Enter Mobile");
		if (quit) {
			// clean up actions here
			JOptionPane.showMessageDialog(null, "we have been interrupted. Bye");
			return;
		}

		String email = JOptionPane.showInputDialog("Enter Email");
		if (quit) {
			// clean up actions here
			JOptionPane.showMessageDialog(null, "we have been interrupted. Bye");
			return;
		}

		// encapsulate user details in an object
		UserDetails userDetails = new UserDetails(name, mobile, email);

		// Acknowledge user
		JOptionPane.showMessageDialog(null, "Thank You " + userDetails);

	}

}

class UserDetails {

	private String name;
	private String mobile;
	private String email;

	public UserDetails(String name, String mobile, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}

}