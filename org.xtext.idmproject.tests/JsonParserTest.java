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
	 }
}
