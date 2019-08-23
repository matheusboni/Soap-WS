package br.com.soapws.service;

import br.com.soapws.exception.TarefaException;
import br.com.soapws.models.ListaTarefas;
import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;

public interface TarefaService {

	public Retorno adicionarTarefa(Tarefa tarefa) throws TarefaException;

	public Object obterTarefa(long idTarefa) throws TarefaException;

	public Retorno removerTarefa(long idTarefa) throws TarefaException;

	public ListaTarefas obterTarefas() throws TarefaException;

}
