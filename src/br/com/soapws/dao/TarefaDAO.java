package br.com.soapws.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import br.com.soapws.models.Status;
import br.com.soapws.models.Tarefa;

public class TarefaDAO {

	private static List<Tarefa> tarefas = new ArrayList<>();

	static Random r = new Random();

	public static void iniciaValoresGenericos() {
		tarefas.add(new Tarefa(r.nextLong(), "Fazer compras", "Realizar compras do mês no mercado", Status.Pendente));
		tarefas.add(new Tarefa(r.nextLong(), "Dar banho nos cachorros", "Dar banho e passear com os cachorros", Status.Concluida));
		tarefas.add(new Tarefa(r.nextLong(), "Trabalho da faculdade", "Fazer projeto para a próxima aula de arquitetura de software", Status.Em_Andamento));
	}

	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}

	public Tarefa obterTarefa(long idTarefa) {
		return tarefas.stream().filter(t -> t.getId() == idTarefa).collect(Collectors.toList()).get(0);
	}

	public void removerTarefa(long idTarefa) {
		Tarefa tarefa = this.obterTarefa(idTarefa);
		tarefas.remove(tarefa);
	}

	public List<Tarefa> obterTarefas() {
		return TarefaDAO.tarefas;
	}

}
