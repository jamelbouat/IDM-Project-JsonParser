import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;import java.io.FileReader;
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
		 ExporterToCsv exporter = new ExporterToCsv();
		 exporter.execute(jsonObject);
 
}
}
class ExporterToCsv{
 public void execute(JSONObject jsonObject){
		 String[] keys = new String[jsonObject.keySet().size()];
		 Arrays.fill(keys, "");
		 int i =0;
		 for(Object o:jsonObject.keySet()) {
			if(o instanceof String) {
				keys[i] = o.toString();}
			if(o instanceof Integer) {
				keys[i] = String.valueOf(o);
}			i++;}
		 String[] values = new String[jsonObject.values().size()];
		 Arrays.fill(values, "");
		 i =0;
		 for(Object o:jsonObject.values()) {
			if(o instanceof String) {
				values[i] = o.toString();}
			else {

				values[i] = String.valueOf(o);
}			i++;
		}
List<String[]> lines = new ArrayList<>();
		lines.add(keys);
		lines.add(values);
		File csvOutputFile = new File("newFile.csv");
	    try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
	        lines.stream()
	          .map(this::convertToCSV)
           .forEach(pw::println);
	    } catch (Exception e) {
			e.printStackTrace();
		}
}private String convertToCSV(String[] data) {
	    return Stream.of(data)
	      .map(this::escapeSpecialCharacters)
	      .collect(Collectors.joining(","));
	}
private String escapeSpecialCharacters(String data) {
	    String escapedData = data.replaceAll("\\R", " ");
	    if (data.contains(",") || data.contains("\"") || data.contains("'")) {
	        data = data.replace("\"", "\"\"");
	        escapedData = "\"" + data + "\"";
	    }
	    return escapedData;
	 }
}
