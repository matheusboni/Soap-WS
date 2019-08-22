package br.com.soapws.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaTarefas {

	@XmlElement(name="tarefa")
	private List<TarefaDTO> tarefas = new ArrayList<>();

	public ListaTarefas(List<Tarefa> tarefas) {
		super();
		this.tarefas = tarefas.stream().map(t -> new TarefaDTO(t)).collect(Collectors.toList());
	}

	public ListaTarefas() {
	}

	public List<TarefaDTO> getTarefas() {
		return tarefas;
	}

}
