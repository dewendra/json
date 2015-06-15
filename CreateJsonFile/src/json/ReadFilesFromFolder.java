package json;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ReadFilesFromFolder {
	String fleName;

	public static void main(String[] args) {

		String path = "/home/tabkidsadmin/Desktop/test/154";
		ReadFilesFromFolder readFilesFromFolder = new ReadFilesFromFolder();
		//readFilesFromFolder.fleName=JOptionPane.showInputDialog("Enter file for search");
		 
		readFilesFromFolder.readFile(new File(path));
	}

	void readFile(File directoryToRead) {
		System.out
				.println("Searching in:-" + directoryToRead.getAbsolutePath());
		System.out.println("Reading Folder:--" + directoryToRead.getName());
		System.out.println("parent Name:-" + directoryToRead.getParent());
		File listFile[]=directoryToRead.listFiles();
		
		if(null!=listFile && listFile.length>0);
		{
			System.out.println("No of file avaiable is :--" +listFile.length);
		
			for (File file : listFile) {


				if(file.isDirectory()){
					readFile(file);
				}else {

				 if(file.getName().equals(this.fleName)){
					 System.out.println(file.getAbsolutePath());
				 }
				}


			}
		}
}
}