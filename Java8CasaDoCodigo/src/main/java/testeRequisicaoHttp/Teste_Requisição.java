package testeRequisicaoHttp;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonObjectParser;

public class Teste_Requisição {

	public static void main(String[] args) throws IOException {

		HttpRequestFactory fabricaRequisicao = new NetHttpTransport().createRequestFactory();
		HttpRequest request = fabricaRequisicao.buildGetRequest(
				new GenericUrl("http://correios.postmon.com.br/webservice/buscaEventos/?objetos=PN876436923BR"));
		
		JSONObject response = new JSONObject(request.execute().parseAsString());
		
		System.out.println(response.get("versao"));
		
		JSONArray objetoArray = response.getJSONArray("objeto");
		//Como nosso array do json só tem um objeto , acessaemos com o index 0
		System.out.println(objetoArray.getJSONObject(0).get("erro"));

	}

}
