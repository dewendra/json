package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;
public class CreateAJsonFile {
	public static void main(String[] args) throws JSONException, IOException {
		
		
		
		JSONObject jsonObject=new JSONObject();
        jsonObject.put("name", "Dewendra");
        jsonObject.put("age", new Integer(26));
        
    	JSONArray list = new JSONArray();
    	list.add("msg 1");
    	list.add("msg 2");
    	list.add("msg 3");
     
    	jsonObject.put("messages", list);
    	{
    	FileWriter fileWriter=new FileWriter("/home/tabkidsadmin/Desktop/test/test2.json");
    	fileWriter.write(jsonObject.toString());
    	fileWriter.flush();
    	fileWriter.close();
    	}
		
		/*try {
			File file=new File("/home/tabkidsadmin/Desktop/test/new.json");
			if(file.createNewFile())
			{
				System.out.println("A Json File is created !");
				
			}else{
				System.out.println("A Json File is already exists");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		System.out.println(jsonObject);
	}

}
