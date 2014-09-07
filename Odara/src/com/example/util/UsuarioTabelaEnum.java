package com.example.util;

public enum UsuarioTabelaEnum {
	COLUNA_IDADE("idade"), COLUNA_NOME("nome"),COLUNA_SEXO("sexo"), NOME_CLASSE("usuario");
	
	private final String text;

	private UsuarioTabelaEnum(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
	
}
