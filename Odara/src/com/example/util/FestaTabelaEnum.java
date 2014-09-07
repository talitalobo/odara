package com.example.util;

public enum FestaTabelaEnum {
	COLUNA_NOME("nome"), COLUNA_DATA("data"), COLUNA_SENHA("senha"), COLUNA_DONO("dono"),
	COLUNA_PARTICIPANTES("participantes"),COLUNA_LISTA_MUSICAS("listaMusicas"), 
	COLUNA_LISTA_CATEGORIA("listaCategorias"),NOME_CLASSE("festa");
	
	private final String text;

	private FestaTabelaEnum(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

}
