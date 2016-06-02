package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Episodio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEpisodio;
	private int idTemporada;
	private String nomeEpisodio;

	
	public int getIdTemporada() {
		return idTemporada;
	}
	public void setIdTemporada(int idTemporada) {
		this.idTemporada = idTemporada;
	}
	public String getNomeEpisodio() {
		return nomeEpisodio;
	}
	public void setNomeEpisodio(String nomeEpisodio) {
		this.nomeEpisodio = nomeEpisodio;
	}




}