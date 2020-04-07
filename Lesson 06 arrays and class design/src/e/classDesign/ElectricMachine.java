package e.classDesign;

public class ElectricMachine extends Machine {

	private boolean on;

	public void switchOn() {
		this.on = true;
		System.out.println(">>> switched on");
	}

	public void switchOff() {
		this.on = false;
		System.out.println(">>> switched off");
	}

	public boolean isOn() {
		return on;
	}

}
