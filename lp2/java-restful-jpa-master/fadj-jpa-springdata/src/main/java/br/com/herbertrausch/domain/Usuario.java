package br.com.herbertrausch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String nome;
	private String nickname;
	private String email;
	private String senha;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNickname() {
		return nickname;
	}
	public String setNickname(String nickname) {
		return this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha(){
		return senha;
	}
    public void setSenha(String senha){
    	this.senha = senha;
    }
	@Override
	public String toString() {
		return "Usuario [Nome=" + nome + ", Nickname=" + nickname + ", Email=" + email +  "]";
	}
}
