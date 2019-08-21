package br.com.soapws.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;
import br.com.soapws.service.TarefaServiceImpl;

@WebService
public class TarefaWS {

	private TarefaServiceImpl tarefaService = new TarefaServiceImpl();

	@WebMethod(operationName = "cadastroTarefa")
	@WebResult(name = "retorno")
	public Retorno adicionarTarefa(Tarefa tarefa) {
		return this.tarefaService.adicionarTarefa(tarefa);
	}

	@WebMethod(operationName = "obterTarefa")
	@WebResult(name = "tarefa")
	public Tarefa obterTarefa(@WebParam(name = "idTarefa") long idTarefa) {
		return this.tarefaService.obterTarefa(idTarefa);
	}

	@WebMethod(operationName = "removerTarefa")
	@WebResult(name = "retorno")
	public Retorno removerTarefa(@WebParam(name = "idTarefa") long idTarefa) {
		return this.tarefaService.removerTarefa(idTarefa);
	}

	@WebMethod(operationName = "todasTarefas")
	@WebResult(name = "tarefa")
	public List<Tarefa> obterTarefas() {
		return this.tarefaService.obterTarefas();
	}

}
