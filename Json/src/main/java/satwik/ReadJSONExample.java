package satwik;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
public class ReadJSONExample
{
    public static void main(String[] args) throws Exception   {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
FileReader reader = new FileReader("C:\\Users\\Training\\eclipse-workspace\\venkatesh\\src\\main\\java\\venkatesh\\cars.json");
       
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray carsList = (JSONArray) obj;
            System.out.println(carsList);
     
         /*    
            //Iterate over employee array
            carsList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
    	
    	//JSONObject site = (JSONObject)jsonSites.get(i);
        JSONObject employeeObject = (JSONObject) employee.get("metadata");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("make");   
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("model"); 
        System.out.println(lastName);
         
        //Get employee website name
        String website = (String) employeeObject.get("price");   
        System.out.println(website);
    }
    */
}                
    }