package c.nestedClasses.states;

import c.nestedClasses.states.State.Citizen;

public class Test1 {

	public static void main(String[] args) {

		// the enclosing
		State israel = new State("Israel");
		State france = new State("France");

		// the enclosed type - depends on State instance
		Citizen dan = israel.new Citizen("Dan");
		Citizen dana = israel.new Citizen("Dana");

		Citizen pier = france.new Citizen("Pier");
		Citizen clod = france.new Citizen("Clod");

		System.out.println(dan.getName() + " from " + dan.getStateName());
		System.out.println(clod.getName() + " from " + clod.getStateName());
		System.out.println(dana.getName() + " from " + dana.getStateName());
		System.out.println(pier.getName() + " from " + pier.getStateName());

	}

}
