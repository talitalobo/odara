package com.example.model;

import java.util.ArrayList;

public class Categoria {
	
	private String nome;
	private String idFesta;
	private int votos;
	private ArrayList<String> usuarioQueVotaram;
	
	
	public Categoria(String nome, int votos){
		if(validaCampos(nome)){
			this.votos=votos;
		}
		usuarioQueVotaram = new ArrayList<String>();
	}
	
	private boolean validaCampos(String nome){
		return (nome!=null && (!nome.trim().equals("")));
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public ArrayList<String> getUsuarioQueVotaram() {
		return usuarioQueVotaram;
	}
	public void setUsuarioQueVotaram(ArrayList<String> usuarioQueVotaram) {
		this.usuarioQueVotaram = usuarioQueVotaram;
	}
	
	
}
