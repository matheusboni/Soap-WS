package br.com.soapws.service;

import br.com.soapws.models.ListaTarefas;
import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;
import br.com.soapws.models.TarefaDTO;

public interface TarefaService {

	public Retorno adicionarTarefa(Tarefa tarefa);

	public TarefaDTO obterTarefa(long idTarefa);

	public Retorno removerTarefa(long idTarefa);

	public ListaTarefas obterTarefas();

}
