package agenda.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private Date dtInicio;
	private Date dtFim;
	private String descricao;
	private String nome;
	
	
	public Evento(Date dtInicio, Date dtFim, String descricao, String nome) {
		super();
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.descricao = descricao;
		this.nome = nome;
	}

	
	public Evento() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
