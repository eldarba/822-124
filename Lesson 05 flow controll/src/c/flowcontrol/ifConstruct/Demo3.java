package c.flowcontrol.ifConstruct;

public class Demo3 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 201);
//		grade = 50;
		System.out.println(grade);

		if (grade >= 0 && grade <= 100) {
			if (grade < 60) {
				System.out.println("fail");
			} else if (grade < 70) {
				System.out.println("ok");
			} else if (grade < 80) {
				System.out.println("good");
			} else if (grade < 90) {
				System.out.println("very good");
			} else {
				System.out.println("GREAT!!!");
			}
		} else {
			System.out.println("grade " + grade + " is out of range");
		}

		System.out.println("end");
	}

}
