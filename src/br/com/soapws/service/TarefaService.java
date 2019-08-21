package br.com.soapws.service;

import java.util.List;

import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;

public interface TarefaService {

	public Retorno adicionarTarefa(Tarefa tarefa);

	public Tarefa obterTarefa(long idTarefa);

	public Retorno removerTarefa(long idTarefa);

	public List<Tarefa> obterTarefas();
	
}
