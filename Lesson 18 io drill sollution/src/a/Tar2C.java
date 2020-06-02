package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Tar2C {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 6) + 10;
			list.add(r);
		}

		System.out.println(list);

		Set<Integer> set = new LinkedHashSet<>(list);

		File file = new File("files/text/numbers.txt");

		try (PrintWriter out = new PrintWriter(file);) {

			out.println(set);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
