package br.com.soapws.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import br.com.soapws.exception.TarefaException;
import br.com.soapws.models.ListaTarefas;
import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;
import br.com.soapws.models.TarefaDTO;
import br.com.soapws.service.TarefaServiceImpl;

@WebService
public class TarefaWS {

	private TarefaServiceImpl tarefaService = new TarefaServiceImpl();

	@WebMethod(operationName = "cadastroTarefa")
	@WebResult(name = "retorno")
	public Retorno adicionarTarefa(@XmlElement(required = true) Tarefa tarefa) throws TarefaException {
		return this.tarefaService.adicionarTarefa(tarefa);
	}

	@WebMethod(operationName = "obterTarefa")
	@WebResult(name = "tarefa")
	public TarefaDTO obterTarefa(@WebParam(name = "idTarefa") long idTarefa) throws TarefaException {
		return this.tarefaService.obterTarefa(idTarefa);
	}

	@WebMethod(operationName = "removerTarefa")
	@WebResult(name = "retorno")
	public Retorno removerTarefa(@WebParam(name = "idTarefa") long idTarefa) throws TarefaException {
		return this.tarefaService.removerTarefa(idTarefa);
	}

	@WebMethod(operationName = "todasTarefas")
	@WebResult(name = "tarefas")
	public ListaTarefas obterTarefas() throws TarefaException {
		return this.tarefaService.obterTarefas();
	}

}
