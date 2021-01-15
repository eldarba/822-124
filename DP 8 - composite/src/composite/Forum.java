package composite;

import java.util.ArrayList;
import java.util.List;

public class Forum extends Component {

	private List<Component> members = new ArrayList<>();
	private String forumName;

	public Forum(String name) {
		super();
		this.forumName = name;
	}

	@Override
	public void introduceYourself() {
		for (Component component : members) {
			System.out.print(this.forumName + " >>> ");
			component.introduceYourself();
		}
	}

	/**
	 * @param member the member to add - can be a person or a forum
	 */
	public void addMember(Component member) {
		members.add(member);
	}

	/**
	 * @param member the member to remove - can be a person or a forum
	 */
	public void removeMember(Component member) {
		members.remove(member);
	}

}
