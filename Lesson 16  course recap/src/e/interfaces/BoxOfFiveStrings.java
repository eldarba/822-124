package e.interfaces;

public class BoxOfFiveStrings implements Container<String> {

	private String[] arr = new String[5];

	@Override
	public void add(String content) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = content;
				break;
			}
		}

	}

	@Override
	public void clear() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = null;
		}
	}

}
