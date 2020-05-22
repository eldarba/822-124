package e.interfaces;

public class BoxOfString implements Container<String> {

	private String content;

	@Override
	public void add(String content) {
		this.content = content;
	}

	@Override
	public void clear() {
		this.content = null;
	}

	public String getContent() {
		return content;
	}

	// ============= Test
	public static void main(String[] args) {

		BoxOfString boxOfString = new BoxOfString();

		System.out.println(boxOfString.getContent());

		boxOfString.add("AAA");
		System.out.println(boxOfString.getContent());
		boxOfString.add("NNN");
		System.out.println(boxOfString.getContent());
		boxOfString.clear();
		System.out.println(boxOfString.getContent());
	}

}
