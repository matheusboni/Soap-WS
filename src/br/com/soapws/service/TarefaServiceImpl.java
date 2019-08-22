package br.com.soapws.service;

import br.com.soapws.dao.TarefaDAO;
import br.com.soapws.models.ListaTarefas;
import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;
import br.com.soapws.models.TarefaDTO;

public class TarefaServiceImpl implements TarefaService{

	private TarefaDAO tarefaDao = new TarefaDAO();

	private Retorno retorno;

	@Override
	public Retorno adicionarTarefa(Tarefa tarefa) {
		long id = tarefaDao.adicionarTarefa(tarefa);
		retorno = new Retorno(201, "Tarefa adicionada id: " + id);
		return retorno;
	}

	@Override
	public TarefaDTO obterTarefa(long idTarefa) {
		return new TarefaDTO(tarefaDao.obterTarefa(idTarefa));
	}

	@Override
	public Retorno removerTarefa(long idTarefa) {
		tarefaDao.removerTarefa(idTarefa);
		retorno = new Retorno(200, "Tarefa removida");
		return retorno;
	}

	@Override
	public ListaTarefas obterTarefas() {
		return new ListaTarefas(tarefaDao.obterTarefas());
	}

}
