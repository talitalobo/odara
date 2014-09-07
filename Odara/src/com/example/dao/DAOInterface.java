package com.example.dao;

import com.example.model.Categoria;
import com.example.model.Festa;
import com.example.model.Musica;
import com.example.model.Usuario;

/**
 * Classe responsavel por manipular instancias do banco
 * @author Lucas
 *
 */
public interface DAOInterface {
	
	public void persitirFesta(Festa festa);
	
	public void persitirUsuario(Usuario usuario);
	
	public void persitirMusica(Musica musca);
	
	public void persitirCategoria(Categoria categoria);
	
	public void atualizaUsuario(Usuario usuario);
	
	public void atualizaMusica(Musica musica);
	
	public void atualizaCategoria(Categoria categoria);
	
	public void atualizaFesta(Festa festa);
	
	public void remove();
}
