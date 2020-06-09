package a.stoppingThreads.details;

import java.util.Scanner;

public class StopDetailsGetter implements Runnable {

	private DetailsGetter detailsGetter;

	public StopDetailsGetter(DetailsGetter detailsGetter) {
		super();
		this.detailsGetter = detailsGetter;
	}

	@Override
	public void run() {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("do you realy want to stop them? y/n");
			String option = sc.nextLine();
			if (option.equalsIgnoreCase("y")) {
				detailsGetter.quit();
				System.out.println("the detials getter was stopped");
			}

		}

	}

}
