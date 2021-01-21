import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParserTest {
	 public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		 JSONParser parser = new JSONParser();
		 Object obj = parser.parse(new FileReader("file.json"));
		 JSONObject jsonObject = (JSONObject)obj;
		 FileWriter fileWriter;
		 long value1, value2;
		 jsonObject.put("key1", "updatedValue1");
		 System.out.println ("updatedValue1");
		 fileWriter = new FileWriter("file.json");
		 fileWriter.write(jsonObject.toJSONString());
		 fileWriter.flush();
		 fileWriter.close();
		 jsonObject.put("key2", "updatedValue2");
		 System.out.println ("updatedValue2");
		 fileWriter = new FileWriter("file.json");
		 fileWriter.write(jsonObject.toJSONString());
		 fileWriter.flush();
		 fileWriter.close();
	 }
}
