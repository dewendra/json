package json;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class WriteOnJsonFile {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject json=new JSONObject();
		json.put("list","" );
		
		JSONArray array = new JSONArray();
		
		JSONObject arrayElementOne = new JSONObject();
		arrayElementOne.put("right", "");
		JSONArray arrayElementOneArray = new JSONArray();
		
		JSONObject arrayElementOneArrayElementOne = new JSONObject();
		arrayElementOneArrayElementOne.put("", "ABC");
		arrayElementOneArrayElementOne.put("", "STRING");
		//arrayElementOneArray.put(arrayElementOneArrayElementOne);
		
		arrayElementOne.put("right", arrayElementOneArray);
		json.put("right", array);
		/*JSONArray list = new JSONArray();
		list.add("");
		json.put("list", list);
		
		JSONArray right =new JSONArray();
		right.add("a.png");
		right.add("b.png");
		right.add("c.png");
		json.put("right", right);
		
		JSONArray left =new JSONArray();
		left.add("a1.png");
		left.add("b1.png");
		left.add("c1.png");
		json.put("left", left);
		*/
		try {
			//String content=("Your content here");
			//System.out.println("{"+""+" list "+":"+"["+"{"+"right"+":"+"["+"folderName/"+"SubfolderName"+"/image.png"+","+"]"+","+"left"+":"+"["+"folderName/SubfolderName"+"]"+"},"+"]"+"}");
			
			File file=new File("/home/tabkidsadmin/Desktop/test/154/json/new.json");
			System.out.println(file.getParent());
			// if file doesnot exists, then create it
			if(!file.exists())
			{
				file.createNewFile();
				
			}
			FileWriter fw=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(json.toString());
			bw.close();
			System.out.println("Successfully Copied JSON Object to File...");
			//System.out.println("\nJSON Object: " + json);
			System.out.println("Done");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		/*finally {
          file.colse();
        }*/
	}
}
