package com.example.model;

import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private int idade;
	private String sexo;
	private boolean isDj;
	private String id;
	
	
	public Usuario(String nome, int idade, String sexo, boolean isDj){
		
		if(validaCampos(nome, sexo)){
			this.nome = nome;
			this.sexo = sexo;
		}
		
		this.idade = idade;
		this.isDj = isDj;
	}
	
	private boolean validaCampos(String nome, String sexo){
		boolean valida = false;
		if(sexo!=null && (sexo.trim().toUpperCase().equals("F") || sexo.trim().toUpperCase().equals("M"))){
			if(nome!=null && (!nome.trim().equals(""))){
				valida = true;
			}
		}
		return valida;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isDj() {
		return isDj;
	}
	public void setDj(boolean isDj) {
		this.isDj = isDj;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
