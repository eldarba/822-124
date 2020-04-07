package e.classDesign;

public class Demo1 {

	public static void main(String[] args) {

		Microwave[] microwaves = new Microwave[10];

		microwaves[0] = new ExtendedMicrowave();
		microwaves[1] = new Microwave();

		ElectricMachine[] electricMachines = new ElectricMachine[5];
		electricMachines[0] = new ElectricMachine();
		electricMachines[1] = new Dishwasher();
		electricMachines[2] = new ExtendedMicrowave();
		electricMachines[3] = new Microwave();

	}

}
