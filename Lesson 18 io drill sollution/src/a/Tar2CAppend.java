package a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Tar2CAppend {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 6) + 10;
			list.add(r);
		}

		System.out.println(list);

		Set<Integer> set = new LinkedHashSet<>(list);

		File file = new File("files/text/numbers.txt");

		try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true));) {

			out.write(set.toString());
			out.newLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
