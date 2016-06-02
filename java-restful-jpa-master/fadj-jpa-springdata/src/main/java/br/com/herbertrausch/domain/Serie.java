package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Serie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idSerie;
	private String nomeSerie;
	private String generoSerie;
	private String emissoraSerie;


	public String nomeSerie() {
		return nomeSerie;
	}
	public void setNome(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}
	public String getgeneroSerie() {
		return generoSerie;
	}
	public String setgeneroSerie(String generoSerie) {
		return this.generoSerie = generoSerie;
	}
	public String getemissoraSerie() {
		return emissoraSerie;
	}
	public void setemissoraSerie(String emissoraSerie) {
		this.emissoraSerie = emissoraSerie;
	}
	@Override
	public String toString() {
		return "Series [Nome da série=" + nomeSerie + ", Gênero da série=" + generoSerie + ", Emissora da série=" + emissoraSerie +  "]";
	}
}