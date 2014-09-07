package com.example.util;

public enum CategoriaUsuarioTabelaEnum {
	NOME_CATEGORIA("categorias"),NOME_MUSICA("musicas"),COLUNA_NOME("nome"),COLUNA_VOTOS("votos"),COLUNA_USUARIOS_VOTARAM("usuarioVotantes");
	
	private final String text;

	private CategoriaUsuarioTabelaEnum(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
