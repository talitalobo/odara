package com.example.model;

import java.util.ArrayList;
import java.util.Date;

public class Festa {
	private String nome;
	private Usuario dono;
	private Date data;
	private String senha;
	private ArrayList<Usuario> participantes;
	private ArrayList<Musica> listaMusicas;
	private ArrayList<Categoria> listaCategoria;
	
	public Festa(String nome, Date data, String senha, Usuario dono){
		if(validaCampos(nome, data, senha, dono)){
			this.nome = nome;
			this.data=data;
			this.senha=senha;
			this.dono = dono;
		}
		listaCategoria = new ArrayList<Categoria>();
		listaMusicas = new ArrayList<Musica>();
		participantes = new ArrayList<Usuario>();
	}
	
	private boolean validaCampos(String nome, Date data, String senha, Usuario dono){	
		return (data!=null && nome!=null && dono!=null && (!nome.trim().equals("") && 
				!senha.trim().equals("")));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Usuario> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Usuario> participantes) {
		this.participantes = participantes;
	}

	public ArrayList<Musica> getListaMusicas() {
		return listaMusicas;
	}

	public void setListaMusicas(ArrayList<Musica> listaMusicas) {
		this.listaMusicas = listaMusicas;
	}

	public ArrayList<Categoria> getListaCategoria() {
		return listaCategoria;
	}

	public void setListaCategoria(ArrayList<Categoria> listaCategoria) {
		this.listaCategoria = listaCategoria;
	}

	public Usuario getDono() {
		return dono;
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}
	
}
