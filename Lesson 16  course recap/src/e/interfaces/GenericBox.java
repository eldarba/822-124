package e.interfaces;

public class GenericBox<S> implements Container<S> {

	private S content;

	@Override
	public void add(S content) {
		this.content = content;

	}

	@Override
	public void clear() {
		this.content = null;

	}

	public S getContent() {
		return content;
	}

	// ============= Test
	public static void main(String[] args) {
		GenericBox<Integer> genericBoxInt = new GenericBox<>();
		genericBoxInt.add(5);
		System.out.println(genericBoxInt.getContent());
		genericBoxInt.clear();
		System.out.println(genericBoxInt.getContent());
	}

}
