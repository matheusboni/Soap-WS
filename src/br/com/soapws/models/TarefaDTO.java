package br.com.soapws.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TarefaDTO {

	private long id;

	@XmlElement
	private String titulo;

	@XmlElement
	private String descricao;

	@XmlElement
	private Status status;

	public TarefaDTO(Tarefa tarefa) {
		super();
		this.id = tarefa.getId();
		this.titulo =  tarefa.getTitulo();
		this.descricao =  tarefa.getDescricao();
		this.status =  tarefa.getStatus();
	}

	public TarefaDTO() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

}
