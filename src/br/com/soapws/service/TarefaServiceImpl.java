package br.com.soapws.service;

import br.com.soapws.dao.TarefaDAO;
import br.com.soapws.exception.TarefaException;
import br.com.soapws.models.ListaTarefas;
import br.com.soapws.models.Retorno;
import br.com.soapws.models.Tarefa;
import br.com.soapws.models.TarefaDTO;

public class TarefaServiceImpl implements TarefaService{

	private TarefaDAO tarefaDao = new TarefaDAO();

	private Retorno retorno;

	@Override
	public Retorno adicionarTarefa(Tarefa tarefa) throws TarefaException{
		try {
			long id = tarefaDao.adicionarTarefa(tarefa);
			retorno = new Retorno(201, "Tarefa adicionada id: " + id);
			return retorno;
		} catch(Exception e) {
			System.out.println(e);
			throw new TarefaException("Não foi possível adicionar a tarefa");
		}
	}

	@Override
	public TarefaDTO obterTarefa(long idTarefa) throws TarefaException {
		try {
			return new TarefaDTO(tarefaDao.obterTarefa(idTarefa));
		} catch (Exception e) {
			System.out.println(e);
			throw new TarefaException("Tarefa não encontrada pro id: " + idTarefa);
		}
	}

	@Override
	public Retorno removerTarefa(long idTarefa) throws TarefaException {
		try {
			tarefaDao.removerTarefa(idTarefa);
			retorno = new Retorno(200, "Tarefa removida");
			return retorno;
		} catch(Exception e) {
			System.out.println(e);
			throw new TarefaException("Não foi possível remover a terafa");
		}
	}

	@Override
	public ListaTarefas obterTarefas() throws TarefaException{
		try {
			return new ListaTarefas(tarefaDao.obterTarefas());
		} catch(Exception e) {
			System.out.println(e);
			throw new TarefaException("Não foi possível obter lista de tarefas");
		}
	}

}
