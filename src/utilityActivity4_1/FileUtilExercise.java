package utilityActivity4_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class FileUtilExercise {

	public static void main(String[] args) throws IOException {
		File file=new File("src/utilityActivity4_1/test.txt");
		boolean createNewFile = file.createNewFile();
		 File fileutils = FileUtils.getFile("src/utilityActivity4_1/test.txt");
		System.out.println("data in File"+ FileUtils.readFileToString(fileutils,"UTF8"));
		 File Descdir=new File("Resources");
		 FileUtils.copyFileToDirectory(file, Descdir);
		 
		 File newFile=FileUtils.getFile(Descdir,"test.txt");
		 FileUtils.readFileToString(newFile,"UTF8");
			System.out.println("data in File"+newFile );
		 
		
	}

}
