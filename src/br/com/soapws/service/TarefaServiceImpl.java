package br.com.soapws.service;

import java.util.List;

import br.com.soapws.dao.TarefaDAO;
import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;

public class TarefaServiceImpl implements TarefaService{

	private TarefaDAO tarefaDao = new TarefaDAO();

	private Retorno retorno;

	@Override
	public Retorno adicionarTarefa(Tarefa tarefa) {
		tarefaDao.adicionarTarefa(tarefa);
		retorno = new Retorno(201, "Tarefa adicionada");
		return retorno;
	}

	@Override
	public Tarefa obterTarefa(long idTarefa) {
		return tarefaDao.obterTarefa(idTarefa);
	}

	@Override
	public Retorno removerTarefa(long idTarefa) {
		tarefaDao.removerTarefa(idTarefa);
		retorno = new Retorno(200, "Tarefa removida");
		return retorno;
	}

	@Override
	public List<Tarefa> obterTarefas() {
		return tarefaDao.obterTarefas();
	}

}
