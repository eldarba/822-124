package d.generics;

public class Box<T> {

	private T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	public Box() {
		super();
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	// for better reasons you might want to write generic methods
	public static <A> void print(A val) {
		System.out.println(val);
	}

}
