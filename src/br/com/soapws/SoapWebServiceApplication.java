package br.com.soapws;

import javax.xml.ws.Endpoint;

import br.com.soapws.dao.TarefaDAO;
import br.com.soapws.webservice.TarefaWS;

public class SoapWebServiceApplication {

	public static void main(String[] args) {

		TarefaDAO.iniciaValoresGenericos();

		TarefaWS implementacaoWS = new TarefaWS();
		String URL = "http://localhost:8000/tarefaws";

		System.out.println("TarefaWS rodando: " + URL);

		Endpoint.publish(URL, implementacaoWS);
	}
	
}
