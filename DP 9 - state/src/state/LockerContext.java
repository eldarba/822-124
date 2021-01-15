package state;

public class LockerContext {
	// attributes
	private LockerState state;
	private int combination;

	public LockerContext(LockerState state, int combination) {
		super();
		this.state = state;
		this.combination = combination;
	}

	// lock operation using the current combination
	public void lock() {
		state.handleLock(this);
	}

	// lock operation using the new combination
	public void lock(int combination) {
		this.combination = combination;
		lock();
	}

	// open operation
	public void open(int combination) {
		if (this.combination == combination) {
			state.handleOpen(this);
		} else {
			System.out.println("WRONG CODE!!!");
		}
	}

	public LockerState getState() {
		return state;
	}

	public void setState(LockerState state) {
		this.state = state;
	}

}
