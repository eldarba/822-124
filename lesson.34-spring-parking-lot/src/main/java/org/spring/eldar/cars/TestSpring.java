package org.spring.eldar.cars;

import org.spring.eldar.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			
			ApplicationContext c;
			BeanFactory f;
			
			ctx.getBeanFactory();
			
//			System.out.println(lot1); // the lot1 reference belongs to the container
			System.out.println(ctx.getBean("lot1"));
			

			
			ParkingLot lot = ctx.getBean("lot1", ParkingLot.class);
//			lot.setVehicles(new ArrayList<>());

			Vehicle v;
			int i;

			for (i = 1; i <= 5; i++) {
				v = ctx.getBean(Vehicle.class);
				v.setNumber(i);
				lot.addVehicle(v);
			}
			
			for (; i <= 10; i++) {
				v = ctx.getBean("suv", Vehicle.class);
//				v = new SUVImpl();
				v.setNumber(i);
				lot.addVehicle(v);
			}

			for (; i <= 15; i++) {
				v = ctx.getBean("truck", Vehicle.class);
//				v = new TruckImpl();
				v.setNumber(i);
				lot.addVehicle(v);
			}
			
			System.out.println(lot.getVehicles());
			
			System.out.println("========================");
			ParkingLot lot2 = ctx.getBean("lot2", ParkingLot.class);
			System.out.println(lot2.getVehicles());
			lot2.addVehicle(ctx.getBean(Vehicle.class));
			lot2.addVehicle(ctx.getBean(Vehicle.class));
			System.out.println(lot2.getVehicles());

		
			
		}
	}

}
