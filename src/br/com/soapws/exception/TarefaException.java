package br.com.soapws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "TarefaFault")
public class TarefaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 299710957757959123L;

	public TarefaException(String mensagem) {
		super(mensagem);
	}

	public String getFaultInfo() {
		return "Erro no serviço TarefaWS";
	}

}
