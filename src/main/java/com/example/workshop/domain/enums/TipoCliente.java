package com.example.workshop.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(0, "Pessoa Física"),
	PESSOAJURIDICA(1, "Pessoa Jurídica");
	
	private final int cod;
	private final String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) return null;
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) return x;
		}
		
		throw new IllegalArgumentException("Id inválido." + cod);
	}
}
