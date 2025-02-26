import java.io.File;

public class FilePathExample {
	public static void main(String[] args) {
		// Define the file paths
		String notesPath = "Documents/notas.txt";
		String docsPath = "Documents/project-docs.pdf";
		String imagesPath = "Documents/images";
		String diagramPath = "Documents/iamges/diagram.png";
		
		checkFileOrDirectory(notesPath);
		checkFileOrDirectory(docsPath);
		checkFileOrDirectory(imagesPath);
		checkFileOrDirectory(diagramPath);
	}
	
	public static void checkFileOrDirectory(String path) {
		File file = new File(path);
		if(file.exists()) {
			System.out.println("Path: " + file.getAbsolutePath());      
			
			if(file.isFile()) {
				System.out.println("This path points to a file.");
			} else if (file.isDirectory()) {
				System.out.println("This path points to a directory");
			}
		} else {
			System.out.println("The path \"" + path +"\" does not exist.");
		}
		System.out.println();
	}
}
