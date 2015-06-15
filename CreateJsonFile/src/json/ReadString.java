package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;

public class ReadString {

	static Character myString;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, JSONException {
		System.out.println("Read String from file charecter by charecter.");
		String path = "/home/tabkidsadmin/Desktop/test/test.txt";
		
		String path2 = "/home/tabkidsadmin/Desktop/test/test2.txt";
		
        FileWriter fileWriter=new FileWriter(path2);
        
        
        
        
		try {
			FileReader reader = new FileReader(path);
			int character;
			while ((character = reader.read()) != -1) {
				
                System.out.print((char) character);
                /*if(character=="#"){
                	System.out.println("Find symbolic charecter");
                }*/
               fileWriter.write((char)character);
                
            }
			
            reader.close();
            fileWriter.flush();
            fileWriter.close();
            System.out.println("File hasbeen written");
            System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// for writing on file........++++++++++++++++++++++++++++++++
		
		
        
        
        
        
		
	}
}
