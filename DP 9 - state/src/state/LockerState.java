package state;

public abstract class LockerState {

	// how to lock at a given state
	public abstract void handleLock(LockerContext locker);

	// how to open at a given state
	public abstract void handleOpen(LockerContext locker);

}
