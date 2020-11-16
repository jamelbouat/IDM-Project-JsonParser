import org.json.simple.*;
public class Clazz {
   public static void main(String[] args) {
      JSONParser parser = new JSONParser();
      Object obj = parser.parse(new FileReader(""file.json""));
      JSONObject jsonObject = (JSONObject)obj;}}