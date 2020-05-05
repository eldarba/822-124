package c.nestedClasses.states;

public class State {

	private String name;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return State.this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// INNER TYPE
	public class Citizen {
		private String name;

		public Citizen(String name) {
			super();
			this.name = name;
		}

		public String getName() {
//			return Citizen.this.name;
			return this.name;
		}

		public String getStateName() {
			return State.this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
