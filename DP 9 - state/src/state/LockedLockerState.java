package state;

public class LockedLockerState extends LockerState {

	@Override
	public void handleLock(LockerContext locker) {
		System.out.println("ERROR: already locked");

	}

	@Override
	public void handleOpen(LockerContext locker) {
		locker.setState(new OpenedLockerState());
		System.out.println("Locker is now open");

	}

}
