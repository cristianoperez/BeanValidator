package br.blogger.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Cliente {

	private Integer id;
	private String nome;
	private String email;
	
	public Cliente() {
	
	}
	
	public Cliente(Integer id, String nome, String email){
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	@NotNull(message="Valor n‹o pode ser nulo")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Size(min=5, message="Tamanho deve ser maior que 5")
	@NotNull(message="Nome n‹o pode ser nulo")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Email(message="Email invalido")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
