package e.classDesign;

public class Microwave extends ElectricMachine {

	private int timer;

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public void resetTimer() {
		this.timer = 0;
	}

	public void start() {
		System.out.println(">>>started");
	}

	public void stop() {
		System.out.println(">>>stopped");
	}

}
