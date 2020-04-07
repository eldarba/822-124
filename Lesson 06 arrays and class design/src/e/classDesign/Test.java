package e.classDesign;

public class Test {

	public static void main(String[] args) {

		Machine machine = new Machine();

		// The hashcode() method
		int x = machine.hashCode(); // convert an object to a number
		System.out.println(x);

		// The toString() method
		String s = machine.toString(); // convert an object to a string
		System.out.println(s);

		machine.setSerialNumber(111);
		System.out.println("serial number: " + machine.getSerialNumber());

		System.out.println("=====================");
		ElectricMachine electricMachine = new ElectricMachine();
		System.out.println(electricMachine.hashCode());
		System.out.println(electricMachine.toString());
		electricMachine.setSerialNumber(222);
		System.out.println("serial number: " + electricMachine.getSerialNumber());
		electricMachine.switchOn();
		System.out.println("is on? " + electricMachine.isOn());
		electricMachine.switchOff();
		System.out.println("is on? " + electricMachine.isOn());

		System.out.println("=====================");
		Microwave microwave = new Microwave();
		System.out.println(microwave.hashCode());
		System.out.println(microwave.toString());
		System.out.println(microwave);
		microwave.setSerialNumber(333);
		System.out.println("serial number: " + microwave.getSerialNumber());
		microwave.switchOn();
		System.out.println("is on? " + microwave.isOn());
		microwave.switchOff();
		System.out.println("is on? " + microwave.isOn());
		microwave.start();
		microwave.stop();
		System.out.println("=====================");
		ExtendedMicrowave extendedMicrowave = new ExtendedMicrowave();
		System.out.println(extendedMicrowave.hashCode());
		System.out.println(extendedMicrowave);
		extendedMicrowave.setSerialNumber(444);
		System.out.println("serial number: " + extendedMicrowave.getSerialNumber());
		extendedMicrowave.switchOn();
		System.out.println("is on? " + extendedMicrowave.isOn());
		extendedMicrowave.switchOff();
		System.out.println("is on? " + extendedMicrowave.isOn());
		extendedMicrowave.start();
		extendedMicrowave.stop();
		System.out.println("cooking mode: " + extendedMicrowave.getCookingMode());
		extendedMicrowave.setCookingMode("Defreeze");
		System.out.println("cooking mode: " + extendedMicrowave.getCookingMode());

	}

}
