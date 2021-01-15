package state;

public class Main {

	public static void main(String[] args) {

		LockerContext locker = new LockerContext(new LockedLockerState(), 1234);
		locker.lock();
		locker.open(1111);
		locker.open(1234);
		locker.open(1234);

		locker.lock(5555);
		locker.lock(5555);
		locker.open(1111);
		locker.open(5555);
	}

}
