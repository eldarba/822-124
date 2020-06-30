package d.recursion;

import java.io.File;

public class Demo4FileSYstem {

	/** print all directories, sub directories and their file content */
	public static void printFS(String path) {

		// 1. create a file object from the path
		File file = new File(path); // this can be a file or directory

		// 2. check for base case: is this a file. if yes, print it
		if (file.isFile()) {
			System.out.println("\t" + file);
		} else {
			// 3. if not a file, this must be a directory - get an array of its content
			System.out.println(file);
			File[] files = file.listFiles();
			// 4. send each file in the array to the method (recursion)
			for (File currFile : files) {
				printFS(currFile.getPath());
			}
			System.out.println("=========");
		}

//		// methods you can use =========================
//		file.isDirectory();// האם תיקייה
//		file.isFile(); // האם קובץ
//		File[] filesAndDirs = file.listFiles(); // תוכן
//		String currentPath = file.getPath(); // המרה לשם הקובץ או התיקייה
//		// =============================================

	}

	public static void main(String[] args) {
//		printFS("c:/temp");
		printFS("C:\\Program Files\\eclipse");
	}

}
