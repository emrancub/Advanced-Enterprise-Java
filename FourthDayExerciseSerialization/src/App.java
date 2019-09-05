import java.io.File;

public class App {
	public static void main(String[] args) {
		File file = new File("G:\\University\\12th Semester\\Panthapath - Advance Java\\Java Lab Practice");
		
		File[] files = file.listFiles();
		
		for(File f: files){
			System.out.println("File nae: "+f.getName()+" File size: "+f.length());
			System.out.println(".....................");
		}
	}

}
