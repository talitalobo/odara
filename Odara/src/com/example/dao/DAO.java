package com.example.dao;

import com.example.model.Categoria;
import com.example.model.Festa;
import com.example.model.Musica;
import com.example.model.Usuario;
import com.example.util.FestaTabelaEnum;
import com.parse.ParseObject;

public class DAO implements DAOInterface {
	
	private DAO instance;
	
	private DAO(){};
	
	public DAO getInstace(){
		if(instance==null){
			instance = new DAO();
		}
		return instance;
	}

	@Override
	public void persitirFesta(Festa festa) {
		ParseObject objeto = null;
		if(festa!=null){
			objeto = new ParseObject(FestaTabelaEnum.NOME_CLASSE.toString());
			objeto.put(FestaTabelaEnum.COLUNA_NOME.toString(),
					festa.getNome());
			
			objeto.put(FestaTabelaEnum.COLUNA_DONO.toString(),
					festa.getDono());
			
			objeto.put(FestaTabelaEnum.COLUNA_SENHA.toString(),
					festa.getSenha());
			
			objeto.put(FestaTabelaEnum.COLUNA_LISTA_CATEGORIA.toString(), 
					festa.getListaCategoria());
			
			objeto.put(FestaTabelaEnum.COLUNA_LISTA_MUSICAS.toString(), 
					festa.getListaMusicas());
			
			objeto.put(FestaTabelaEnum.COLUNA_PARTICIPANTES.toString(), 
					festa.getParticipantes());
			
		}
	}

	@Override
	public void persitirUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persitirMusica(Musica musca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persitirCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaMusica(Musica musica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaFesta(Festa festa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	
}
