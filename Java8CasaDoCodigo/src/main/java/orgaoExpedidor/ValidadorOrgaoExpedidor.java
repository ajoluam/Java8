package orgaoExpedidor;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ValidadorOrgaoExpedidor {

	public static void main(String[] args) throws JSONException, IOException {
		String entrada = "002";
		String json = Constante.JSON;
		
		JSONArray jsonArr  = new JSONArray(json);
		
		 for (int i = 0; i < jsonArr.length(); i++)
	        {
	            JSONObject jsonObj = jsonArr.getJSONObject(i);
	            if (jsonObj.get("value").equals(entrada)) System.out.println(jsonObj.get("value"));
	            else System.out.println("Não Encontrei");
	        }
		
	}

}
